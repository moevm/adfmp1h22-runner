package com.example.runner.ui.run

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceManager
import com.example.runner.R
import com.example.runner.databinding.FragmentRunBinding
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.CustomZoomButtonsController


class RunFragment : Fragment() {
    private var _binding: FragmentRunBinding? = null
    private var isStarted = false;
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRunBinding.inflate(inflater, container, false)

        val context = requireActivity().application.applicationContext
        Configuration.getInstance()
            .load(context, PreferenceManager.getDefaultSharedPreferences(context))
        val map = binding.map
        map.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE)

        map.setMultiTouchControls(true)
        map.controller.setZoom(12.0)
        map.controller.setCenter(GeoPoint(59.95, 30.3))
        map.zoomController.setVisibility(CustomZoomButtonsController.Visibility.NEVER)

        val startBtn = binding.startBtn
        startBtn.setOnClickListener {
            if (isStarted) {
                startBtn.text = "Старт"
                startBtn.setBackgroundResource(R.drawable.rounded_corner_button)
                isStarted = false
            } else {
                startBtn.text = "Стоп"
                startBtn.setBackgroundResource(R.drawable.rounded_corner_button_pressed)
                isStarted = true
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}