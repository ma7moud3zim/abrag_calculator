package com.azim.abrag.rectangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.azim.abrag.R

class AreaWidthHeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rect_width_height)

        val calcBtn: Button = findViewById(R.id.calc_btn_wh)
        calcBtn.setOnClickListener{
            val len :Double = findViewById<EditText>(R.id.len).text.toString().toDouble()
            val wid :Double = findViewById<EditText>(R.id.wid).text.toString().toDouble()
            val ret:String = (len*wid).toString() +"   متر²"
            val disp:TextView = findViewById(R.id.res_calc_area_wl)
            disp.text = ret
        }
    }
}