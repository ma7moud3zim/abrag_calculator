package com.example.abrag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import com.example.abrag.convert.FadanToMeter
import com.example.abrag.rectangle.AreaDiameter
import com.example.abrag.rectangle.AreaWidthHeight
import com.example.abrag.triangle.Area3Lines
import com.example.abrag.triangle.Area3angles
import com.example.abrag.triangle.AreaHeightBase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Click listener go to activity of calculating area with 3 lines
        val btn3Ln:Button = findViewById(R.id.btn_3lns)
        btn3Ln.setOnClickListener {
            val intent = Intent(this@MainActivity, Area3Lines::class.java)
            startActivity(intent)
        }

        // Click listener go to activity of calculating area of triangle with 3 angles
        val btn3ang:Button = findViewById(R.id.btn_3ang)
        btn3ang.setOnClickListener {
            val intent = Intent(this@MainActivity, Area3angles::class.java)
            startActivity(intent)
        }

        // Click listener go to activity of calculating area of triangle with height and base
        val btnHBase:Button = findViewById(R.id.btn_hbase)
        btnHBase.setOnClickListener {
            val intent = Intent(this@MainActivity, AreaHeightBase::class.java)
            startActivity(intent)
        }

        // Click listener go to activity of calculating area of rectangle with width and height
        val btnRectAreaWidthHeight:Button = findViewById(R.id.btn_rect_width_height)
        btnRectAreaWidthHeight.setOnClickListener {
            val intent = Intent(this@MainActivity, AreaWidthHeight::class.java)
            startActivity(intent)
        }

        // Click listener go to activity of calculating area with diameter
        val btnRectDiameter:Button = findViewById(R.id.btn_diameter)
        btnRectDiameter.setOnClickListener {
            val intent = Intent(this@MainActivity, AreaDiameter::class.java)
            startActivity(intent)
        }

        // Click listener go to activity that convert fadan to meter²
        val btnFadanToMeter:Button = findViewById(R.id.fadan_to_meter)
        btnFadanToMeter.setOnClickListener {
            val intent = Intent(this@MainActivity, FadanToMeter::class.java)
            startActivity(intent)
        }

    }
}