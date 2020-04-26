package com.diki.idn.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val name1: String by lazy { "Diva" }
    val name2: String by lazy { "Ayu" }
    val name3: String by lazy { "Nana" }
    val name4: String by lazy { "Hera" }
    val name5: String by lazy { "Vita" }
    val name6: String by lazy { "Vira" }
    val name7: String by lazy { "Tere" }
    val name8: String by lazy { "Fafa" }
    val name9: String by lazy { "Fifi" }
    val name10: String by lazy { "Rahma" }
    val name11: String by lazy { "Yuma" }

    lateinit var result: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = "$name1 80"
        diva.setText(result)

        result = "$name2 82"
        ayu.setText(result)

        result = "$name3 78"
        nana.setText(result)

        result = "$name4 89"
        hera.setText(result)

        result = "$name5 92"
        vita.setText(result)

        result = "$name6 75"
        vira.setText(result)

        result = "$name7 86"
        tere.setText(result)

        result = "$name8 90"
        fafa.setText(result)

        result = "$name9 92"
        fifi.setText(result)

        result = "$name10 83"
        rahma.setText(result)

        result = "$name11 87"
        yuma.setText(result)
    }
}
