package com.azim.abrag.triangle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.azim.abrag.R
import kotlin.math.roundToInt
import kotlin.math.sqrt

class Area3Lines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area3lines)

        var calc:Button = findViewById(R.id.calc_btn_3lns)
        calc.setOnClickListener{
            val a:Double = findViewById<EditText>(R.id.ln1).text.toString().toDouble()
            val b:Double = findViewById<EditText>(R.id.ln2).text.toString().toDouble()
            val c:Double = findViewById<EditText>(R.id.ln3).text.toString().toDouble()
            val disp:TextView = findViewById(R.id.area_3lines_result)
            if (a + b <= c || a + c <= b || b + c <= a){
                disp.text = "مثلث غير صحيح."

            }else {
                val s: Double = ((a + b + c) / 2)
                var res: Double = sqrt(s * (s - a) * (s - b) * (s - c))
                val show: String = "%.4f".format(res) + "   متر²"
                disp.text = show
            }
        }

    }


}