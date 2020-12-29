package com.example.projet4a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    companion object {
       // val url: String = "https://pokeapi.co/"
    }

    val mainViewModel: MainViewModel by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.text.observe(this, Observer {
            value -> main_text.text=value
        })
        main_button.setOnClickListener {
            mainViewModel.onClickedIncrement(emailUser = String())
        }
    }
}

