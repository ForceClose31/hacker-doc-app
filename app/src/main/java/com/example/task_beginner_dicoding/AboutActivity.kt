package com.example.task_beginner_dicoding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_beginner_dicoding.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            aboutName.text = "Nur Bashori Rahmat Oktavianto Herman"
            aboutEmail.text = "a227b4ky3415@bangkit.academy"
            aboutImage.setImageResource(R.drawable.profile)
        }
    }
}
