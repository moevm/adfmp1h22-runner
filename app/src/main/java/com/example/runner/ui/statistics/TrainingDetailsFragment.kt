package com.example.runner.ui.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.runner.databinding.FragmentTrainingDetailsBinding
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.CustomZoomButtonsController


class TrainingDetailsFragment : Fragment() {
    private var _binding: FragmentTrainingDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTrainingDetailsBinding.inflate(inflater, container, false)

        binding.backButton.setOnClickListener { view?.findNavController()?.navigateUp() }

        val map = binding.map
        map.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE)

        map.setMultiTouchControls(true)
        map.controller.setZoom(12.0)
        map.controller.setCenter(GeoPoint(59.95, 30.3))
        map.zoomController.setVisibility(CustomZoomButtonsController.Visibility.NEVER)

        return binding.root
    }
}