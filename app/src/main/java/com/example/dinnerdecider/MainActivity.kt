package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist= arrayListOf("chinese", "italian", "Burgers", "Pizza Hut")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DecideButton.setOnClickListener {
            val random=Random()
            val randomFood= random.nextInt(foodlist.count())

            foodName.text=foodlist[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newFood=AddFoodTxt.text.toString()
            if(newFood!="") {
                foodlist.add(newFood)
                AddFoodTxt.text.clear()
            }
        }
    }


}
