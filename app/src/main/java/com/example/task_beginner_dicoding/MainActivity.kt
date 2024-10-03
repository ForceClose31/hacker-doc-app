package com.example.task_beginner_dicoding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task_beginner_dicoding.adapters.HackerAdapter
import com.example.task_beginner_dicoding.models.Hacker

class MainActivity : AppCompatActivity() {

    private lateinit var hackerRecyclerView: RecyclerView
    private lateinit var hackerList: ArrayList<Hacker>
    private lateinit var hackerAdapter: HackerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hackerRecyclerView = findViewById(R.id.hackerRecyclerView)
        hackerList = ArrayList()

        hackerList.add(Hacker("Kevin Mitnick", "Famous for hacking into 40 major corporations", R.drawable.kevin_mitnick))
        hackerList.add(Hacker("Anonymous", "A group known for its hacktivism", R.drawable.anonymous))
        hackerList.add(Hacker("Adrian Lamo", "Best known for hacking into major organizations", R.drawable.adrian_lamo))
        hackerList.add(Hacker("Gary McKinnon", "Known for hacking NASA systems", R.drawable.gary_mckinnon))
        hackerList.add(Hacker("Albert Gonzalez", "Responsible for one of the largest credit card thefts", R.drawable.albert_gonzalez))
        hackerList.add(Hacker("Jonathan James", "First juvenile hacker to be imprisoned in the US", R.drawable.jonathan_james))
        hackerList.add(Hacker("Matthew Bevan", "Hacked into military computers", R.drawable.matthew_bevan))
        hackerList.add(Hacker("LulzSec", "A group known for high-profile cyberattacks", R.drawable.lulzsec))
        hackerList.add(Hacker("Guccifer 2.0", "Known for leaking political documents", R.drawable.guccifer))
        hackerList.add(Hacker("Tsutomu Shimomura", "Helped capture Kevin Mitnick", R.drawable.tsutomu_shimomura))

        // Setup RecyclerView
        hackerAdapter = HackerAdapter(hackerList, this) { selectedHacker ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("hacker", selectedHacker)
            startActivity(intent)
        }

        hackerRecyclerView.layoutManager = LinearLayoutManager(this)
        hackerRecyclerView.adapter = hackerAdapter

        findViewById<Button>(R.id.aboutButton).setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
