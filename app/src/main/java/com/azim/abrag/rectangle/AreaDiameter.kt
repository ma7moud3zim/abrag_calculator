package com.azim.abrag.rectangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.azim.abrag.R
import kotlin.math.sqrt

class AreaDiameter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_diameter)

        val calcBtn: Button = findViewById(R.id.calc_btn_area_diameter)
        calcBtn.setOnClickListener{

            val dim :Double = findViewById<EditText>(R.id.ln1).text.toString().toDouble()
            val ln :Double = findViewById<EditText>(R.id.ln2).text.toString().toDouble()
            val disp: TextView = findViewById(R.id.res_calc_area_diameter)
            if(dim*dim <= ln*ln){
                disp.text = "أدخل معطيات صحيحة."
            }
            else {
                val res: Double = sqrt((dim * dim - ln * ln))
                val show: String = "%.4f".format(res) + "   متر²"
                disp.text = show
            }
        }
    }
}