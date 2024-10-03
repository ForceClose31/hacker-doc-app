package com.example.task_beginner_dicoding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_beginner_dicoding.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set your details
        binding.apply {
            aboutName.text = "basori"
            aboutEmail.text = "bas@gmail.com"
            aboutImage.setImageResource(R.drawable.anonymous)
        }
    }
}
