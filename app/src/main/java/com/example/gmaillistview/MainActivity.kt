package com.example.gmaillistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(20) {
            val index = it + 1
            items.add(ItemModel(
            "\uD83D\uDCE9Foodboyhp.com  ",
                "Join us for the feast",
                "20:30PM",
                resources.getIdentifier("test", "drawable", packageName)
            ))
        }

        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }


}