package com.myproject.itbru_online_shop.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.myproject.itbru_online_shop.R
import com.myproject.itbru_online_shop.databinding.ActivityLoginBinding
import com.myproject.itbru_online_shop.databinding.FragmentDashboardBinding
import com.myproject.itbru_online_shop.ui.util.Prefs

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val s= Prefs(this)
        if (s.getIsLogin()) {
            binding.tvStatus.text = "Sudah Login"
        }else{
            binding.tvStatus.text = "Belum Login"
        }

        binding.btnLogin.setOnClickListener {
            s.setIsLogin(true)
            onBackPressed()
        }

        binding.btnLogout.setOnClickListener{
            s.setIsLogin(false)
            onBackPressed()

        }

        Log.d("RESPON", "PESAN SINGKAT")

    }
}