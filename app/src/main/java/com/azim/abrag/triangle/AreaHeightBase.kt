package com.azim.abrag.triangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.azim.abrag.R

class AreaHeightBase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_height_base)

        val calcBtn : Button = findViewById(R.id.calc_btn_hb)
        calcBtn.setOnClickListener{
            val b:Double= findViewById<EditText>(R.id.base).text.toString().toDouble()
            val h:Double= findViewById<EditText>(R.id.heigh).text.toString().toDouble()
            val res:Double = b/2 * h
            val show: String = "%.4f".format(res) + "   متر²"
            val disp:TextView = findViewById(R.id.res_calc_area_hb)
            disp.text = show
        }
    }
}