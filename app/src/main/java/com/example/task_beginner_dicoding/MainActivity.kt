package com.example.task_beginner_dicoding

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
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

        hackerList.add(
            Hacker(
                "Kevin Mitnick",
                "Famous for hacking into 40 major corporations",
                R.drawable.kevin_mitnick,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.kevin_image1, R.drawable.kevin_image2, R.drawable.kevin_image3)
            )
        )
        hackerList.add(
            Hacker(
                "Anonymous",
                "A group known for its hacktivism",
                R.drawable.anonymous,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.anonymous1, R.drawable.anonymous2, R.drawable.anonymous3)
            )
        )
        hackerList.add(
            Hacker(
                "Adrian Lamo",
                "Best known for hacking into major organizations",
                R.drawable.adrian_lamo,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.adrian_lamo1, R.drawable.adrian_lamo2, R.drawable.adrian_lamo3)
            )
        )
        hackerList.add(
            Hacker(
                "Gary McKinnon",
                "Known for hacking NASA systems",
                R.drawable.gary_mckinnon,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.gary_mckinnon1, R.drawable.gary_mckinnon2, R.drawable.gary_mckinnon3)
            )
        )
        hackerList.add(
            Hacker(
                "Albert Gonzalez",
                "Responsible for one of the largest credit card thefts",
                R.drawable.albert_gonzalez,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.albert_gonzalez1, R.drawable.albert_gonzalez2, R.drawable.albert_gonzalez3)
            )
        )
        hackerList.add(
            Hacker(
                "Jonathan James",
                "First juvenile hacker to be imprisoned in the US",
                R.drawable.jonathan_james,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.jonathan_james1, R.drawable.jonathan_james2, R.drawable.jonathan_james3)
            )
        )
        hackerList.add(
            Hacker(
                "Matthew Bevan",
                "Hacked into military computers",
                R.drawable.matthew_bevan,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.matthew_bevan1, R.drawable.matthew_bevan2)
            )
        )
        hackerList.add(
            Hacker(
                "LulzSec",
                "A group known for high-profile cyberattacks",
                R.drawable.lulzsec,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.lulzsec1, R.drawable.lulzsec2, R.drawable.lulzsec3)
            )
        )
        hackerList.add(
            Hacker(
                "Guccifer 2.0",
                "Known for leaking political documents",
                R.drawable.guccifer,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.guccifer1, R.drawable.guccifer2, R.drawable.guccifer3)
            )
        )
        hackerList.add(
            Hacker(
                "Tsutomu Shimomura",
                "Helped capture Kevin Mitnick",
                R.drawable.tsutomu_shimomura,
                "Achievements: Hacked major corporations, author of 'The Art of Deception'.",
                "Kevin Mitnick is known for his audacious exploits in computer hacking, especially against corporate giants.",
                listOf(R.drawable.tsutomu_shimomura1, R.drawable.tsutomu_shimomura2, R.drawable.tsutomu_shimomura3)
            )
        )

        hackerAdapter = HackerAdapter(hackerList, this) { selectedHacker ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("hacker", selectedHacker)
            startActivity(intent)
        }

        hackerRecyclerView.layoutManager = LinearLayoutManager(this)
        hackerRecyclerView.adapter = hackerAdapter

        findViewById<ImageView>(R.id.aboutIcon).setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
