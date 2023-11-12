package com.example.dashboard

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

open class MainActivity : AppCompatActivity() {
    private var adapter: RecyclerView.Adapter<*>? = null
    private var recyclerViewList: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewList = findViewById(R.id.view)
        var flightV=findViewById<LinearLayout>(R.id.flightView)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewList?.layoutManager = linearLayoutManager // Utilisation de layoutManager au lieu de setLayoutManager

        val news = ArrayList<ListDomain>()
        news.add(ListDomain("Browsing trips in Belgium", "pic1"))
        news.add(ListDomain("book a flight to tunisia   ", "tunisia3"))
        news.add(ListDomain("corea booking offre ", "corea3"))
        news.add(ListDomain("Stays in roma", "roma2"))
        adapter = NewsAdapter(news)
        recyclerViewList?.adapter = adapter // Utilisation de adapter au lieu de setAdapter


        flightV.setOnClickListener{
//            Toast.makeText(this, "Flight Works", Toast.LENGTH_SHORT).show()
            Intent(applicationContext, FlightActivity::class.java).also {
                startActivity(it)
            }
        }
    }


}
