package com.example.aleao.fishtracker.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.aleao.fishtracker.R

/**
 * Display screen.
 */
class MainActivity : AppCompatActivity(), MainContract.MvpView {

    val mPresenter: MainPresenter = MainPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showSignInScreen() {
        Toast.makeText(this,"Take user to ther Sign In Screen",Toast.LENGTH_SHORT).show()
    }

    override fun showSignUpScreen() {
        Toast.makeText(this,"Take user to ther Sign Up Screen",Toast.LENGTH_SHORT).show()
    }
}
