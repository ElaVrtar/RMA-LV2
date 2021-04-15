package com.example.inspiringpeople

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = RecyclerAdapter(this, PeopleRepository)

        recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply { layoutManager = viewManager
            adapter = viewAdapter
        }

        person_add.setOnClickListener()
        {
            startActivity(Intent(this, AddPersonActivity::class.java))
        }
    }
}