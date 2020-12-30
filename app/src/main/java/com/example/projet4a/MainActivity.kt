package com.example.projet4a

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.google.android.material.dialog.MaterialAlertDialogBuilder
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

        mainViewModel.loginLiveData.observe(this, Observer {
            when(it){
                is LoginSuccess -> {
                    //Connection
                }
                LoginError -> {
                MaterialAlertDialogBuilder(this)
                    .setTitle("Error")
                    .setMessage("Erreur compte inconnu")
                    .setPositiveButton("Ok"){dialog, which -> dialog.dismiss()

                    }
                    .show()

            }
            }
        }
        )
        login_button.setOnClickListener {
            mainViewModel.onClickedLogin(login_edit.text.toString().trim(), password_edit.text.toString().trim())
        }
    }
}

