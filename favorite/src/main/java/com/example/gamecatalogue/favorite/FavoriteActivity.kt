package com.example.gamecatalogue.favorite

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gamecatalogue.core.ui.GameAdapter
import com.example.gamecatalogue.favorite.databinding.ActivityFavoriteBinding
import com.example.gamecatalogue.presentation.detail.DetailActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class FavoriteActivity : AppCompatActivity() {
    private val favoriteViewModel: FavoriteViewModel by viewModel()
    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Favorite"

        loadKoinModules(favoriteModule)

        val gameAdapter = GameAdapter()
        gameAdapter.onItemClick = { selectedData ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
            startActivity(intent)
        }

        favoriteViewModel.favoriteGame.observe(this, { dataGame ->
            gameAdapter.setData(dataGame)
            binding.pgrBarFav.visibility = View.GONE
            binding.noDataFav.visibility = if (dataGame.isNotEmpty()) View.GONE else View.VISIBLE
        })

        with(binding.rvFavFragment) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = gameAdapter
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.rvFavFragment.adapter = null
    }
}