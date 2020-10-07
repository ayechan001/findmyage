package com.ayechan.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findMyAge.setOnClickListener{
            val year:Int=whatIsYourYear.text.toString().toInt()
            val month:Int=whatIsYourMonth.text.toString().toInt()
            val day:Int=whatIsYourDay.text.toString().toInt()
            val currentYear=Calendar.getInstance().get(Calendar.YEAR)
            val currentMonths=Calendar.getInstance().get(Calendar.MONTH)
            val currentDays=Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            val yourAge=currentYear-year
            val yourMonth = currentMonths-month
            val yourDay=currentDays-day
            thisIsYourAge.text="You are $yourAge Years $yourMonth Months and $yourDay Days Old!33"
                //yourAge.toString()
        }


    }
}
