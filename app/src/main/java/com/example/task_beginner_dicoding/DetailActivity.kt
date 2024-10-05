package com.example.task_beginner_dicoding

import ImageAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_beginner_dicoding.models.Hacker
import com.example.task_beginner_dicoding.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topToolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            title = "Home"
        }

        binding.topToolbar.setNavigationOnClickListener{
            onBackPressed()
        }
        val hacker = intent.getParcelableExtra<Hacker>("hacker")

        hacker?.let {
            binding.detailTitle.text = hacker.name
            binding.detailDescription.text = hacker.description
            binding.detailAchievements.text = hacker.achievements
            binding.detailBiography.text = hacker.biography
            binding.detailImage.setImageResource(hacker.mainImage)
            binding.additionalImagesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            val imageAdapter = ImageAdapter(hacker.additionalImages)
            binding.additionalImagesRecyclerView.adapter = imageAdapter
        }


        binding.actionShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "${hacker?.name}: ${hacker?.description}")
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }
}
