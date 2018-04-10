package com.example.aleao.fishtracker.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.aleao.fishtracker.R
import com.example.aleao.fishtracker.databinding.MainActivityBinding

/**
 * Display screen.
 */
class MainActivity : AppCompatActivity(), MainContract.MvpView {

    val mPresenter: MainPresenter = MainPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)
        binding.presenter = mPresenter
    }

    override fun showSignInScreen() {
        Toast.makeText(this, "Take user to ther Sign In Screen", Toast.LENGTH_SHORT).show()
    }

    override fun showSignUpScreen() {
        Toast.makeText(this, "Take user to ther Sign Up Screen", Toast.LENGTH_SHORT).show()
    }
}
