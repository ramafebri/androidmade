package com.example.gamecatalogue.presentation.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.gamecatalogue.R
import com.example.gamecatalogue.core.domain.model.Game
import com.example.gamecatalogue.core.domain.model.GameDetail
import com.example.gamecatalogue.databinding.ActivityDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }
    private val detailViewModel: DetailViewModel by viewModel()
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.title_detail)

        val detailGame = intent.getParcelableExtra<Game>(EXTRA_DATA)
        if (detailGame != null) {
            detailViewModel.getDetailGame(detailGame.id).observe(this, { data ->
                if (data != null) {
                    when (data) {
                        is com.example.gamecatalogue.core.data.Resource.Loading -> binding.pgrBarDetail.visibility = View.VISIBLE
                        is com.example.gamecatalogue.core.data.Resource.Success -> {
                            binding.pgrBarDetail.visibility = View.GONE
                            data.data?.let { showDetail(it) }
                        }
                        is com.example.gamecatalogue.core.data.Resource.Error -> {
                            binding.pgrBarDetail.visibility = View.GONE
                            binding.viewErrorDetail.root.visibility = View.VISIBLE
                            binding.viewErrorDetail.tvError.text = data.message ?: getString(R.string.something_wrong)
                        }
                    }
                }
            })
            setStatusFavorite(detailGame.isFavorite)
            binding.fabAdd.setOnClickListener {
                setFavorite(detailGame)
            }
        }
    }

    private fun showDetail(dataGame: GameDetail){
        with(binding){
            Glide.with(root.context)
                .load(dataGame.backgroundImage)
                .into(imgDetail)
            tvDetailName.text = dataGame.name
            tvDetailDate.text = dataGame.released
            tvDetailWebsite.text = dataGame.website
            tvDetailRating.text = dataGame.rating.toString()
            tvDetailDescription.text = dataGame.description
        }
    }

    private fun setFavorite(dataGame: Game){
        detailViewModel.setFavoriteGame(dataGame, !dataGame.isFavorite)
        setStatusFavorite(!dataGame.isFavorite)
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite) {
            binding.fabAdd.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_favorite_pink_24dp))
        } else {
            binding.fabAdd.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_favorite_black_24dp))
        }
    }
}