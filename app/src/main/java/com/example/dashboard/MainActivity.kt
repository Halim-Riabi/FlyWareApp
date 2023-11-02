package com.example.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var adapter: RecyclerView.Adapter<*>? = null
    private var recyclerViewList: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    recyclerViewList = findViewById(R.id.view)

        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewList?.layoutManager = linearLayoutManager // Utilisation de layoutManager au lieu de setLayoutManager

        val news = ArrayList<ListDomain>()
        news.add(ListDomain("Browsing trips in Belgium", "pic1"))
        news.add(ListDomain("book a flight to tunisia   ", "tunisia3"))
        news.add(ListDomain("corea booking offre ", "corea3"))
        news.add(ListDomain("Stays in roma", "roma2"))
        adapter = NewsAdapter(news)
        recyclerViewList?.adapter = adapter // Utilisation de adapter au lieu de setAdapter
    }
}