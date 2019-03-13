package com.example.deni16670090

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener { kocokDadu()
        }
    }

    private fun kocokDadu() {
        val randomCowok = Random().nextInt(6)+1
        val randomperempuan = Random().nextInt(6) + 1
        val drawableRescowo = when (randomCowok) {
            1 -> R.drawable.didik_mobile
            2 -> R.drawable.edi_mobile
            3 -> R.drawable.kiki_mobile
            4 -> R.drawable.filipus_mobile
            5 -> R.drawable.riki_mobile
            else -> R.drawable.huda_mobile        }

        val drawableRescewe = when (randomperempuan) {
            1 -> R.drawable.ayu_mobile
            2 -> R.drawable.mela_mobile
            3 -> R.drawable.umi_mobile
            4 -> R.drawable.hanum_mobile
            5 -> R.drawable.fuji_mobile
            else -> R.drawable.faliz_mobile      }
        perempuan.setImageResource(drawableRescewe)
        laki_laki.setImageResource(drawableRescowo)
    }
}