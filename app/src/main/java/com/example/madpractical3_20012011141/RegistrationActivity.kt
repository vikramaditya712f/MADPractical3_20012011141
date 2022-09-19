package com.example.madpractical3_20012011141

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012011141.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val login = findViewById<TextView>(R.id.logins)

        login.setOnClickListener{

            Intent(this, LoginActivity::class.java).also {startActivity(it)}
            login.movementMethod = LinkMovementMethod.getInstance();

        }

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_layout
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId)
            {
                R.id.bottom_nav_reg->
                {
                    Intent(this,RegistrationActivity::class.java).also{startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}