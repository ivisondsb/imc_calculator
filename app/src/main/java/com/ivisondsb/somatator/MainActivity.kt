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

            if (resultado < 18.5) {
                tab.text = "Abaixo do Peso Ideal"
            }
            if (resultado >= 18.5 && resultado <= 24.9) {
                tab.text = "Peso Ideal"
            }
            if (resultado >= 25.0 && resultado <= 29.9) {
                tab.text = "Acima do Peso Ideal"
            }
            if (resultado >= 30.0 && resultado <= 39.9) {
                tab.text = "Obesidade"
            }
            if (resultado >= 40.0) {
                tab.text = "Obesidade Grave"
            }
        }
    }
}
