package com.example.task_beginner_dicoding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_beginner_dicoding.models.Hacker
import com.example.task_beginner_dicoding.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hacker = intent.getParcelableExtra<Hacker>("hacker")

        hacker?.let {
            binding.detailImage.setImageResource(it.imageResId)
            binding.detailTitle.text = it.name
            binding.detailDescription.text = it.description
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
