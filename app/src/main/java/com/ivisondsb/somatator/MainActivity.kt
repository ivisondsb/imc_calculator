package com.ivisondsb.somatator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calc.setOnClickListener {
            val df = DecimalFormat("0.00")
            val peso = edtpeso.text.toString().toDouble()
            val altura = alt.text.toString().toDouble()

            val resultado = peso / (altura * altura)

            result.text = "Seu IMC é: ${df.format(resultado)}"

        }
    }
}
