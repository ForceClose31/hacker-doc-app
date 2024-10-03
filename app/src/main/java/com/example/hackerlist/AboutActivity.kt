package com.example.hackerlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hackerlist.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set your details
        binding.apply {
            aboutName.text = "Your Name"
            aboutEmail.text = "your_email@dicoding.com"
            aboutImage.setImageResource(R.drawable.your_profile_image)
        }
    }
}
