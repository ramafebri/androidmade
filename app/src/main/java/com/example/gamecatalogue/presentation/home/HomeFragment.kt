package com.example.gamecatalogue.presentation.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gamecatalogue.R
import com.example.gamecatalogue.core.ui.GameAdapter
import com.example.gamecatalogue.databinding.FragmentHomeBinding
import com.example.gamecatalogue.presentation.detail.DetailActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private val homeViewModel: HomeViewModel by viewModel()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {

            val gameAdapter = GameAdapter()
            gameAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
                startActivity(intent)
            }

            homeViewModel.listGame.observe(viewLifecycleOwner, { game ->
                if (game != null) {
                    when (game) {
                        is com.example.gamecatalogue.core.data.Resource.Loading -> binding.pgrBarHome.visibility = View.VISIBLE
                        is com.example.gamecatalogue.core.data.Resource.Success -> {
                            binding.pgrBarHome.visibility = View.GONE
                            gameAdapter.setData(game.data)
                        }
                        is com.example.gamecatalogue.core.data.Resource.Error -> {
                            binding.pgrBarHome.visibility = View.GONE
                            binding.viewError.root.visibility = View.VISIBLE
                            binding.viewError.tvError.text = game.message ?: getString(R.string.something_wrong)
                        }
                    }
                }
            })

            with(binding.rvHomeFragment) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = gameAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.rvHomeFragment.adapter = null
        _binding = null
    }
}
