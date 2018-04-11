package com.example.aleao.fishtracker.main

import android.app.AlertDialog
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.aleao.fishtracker.R
import com.example.aleao.fishtracker.databinding.MainActivityBinding
import kotlinx.android.synthetic.main.custom_dialog.view.*

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
        Toast.makeText(this, "Take user to the Sign In Screen", Toast.LENGTH_SHORT).show()
    }

    override fun showSignUpScreen() {
        Toast.makeText(this, "Take user to the Sign Up Screen", Toast.LENGTH_SHORT).show()
    }

    override fun showDialogScreen() {

        val mView = layoutInflater.inflate(R.layout.custom_dialog, null)
        val mClose = mView.close_dialog
        val mSenha = mView.senha_informada
        val mOk = mView.ok

        mOk.setOnClickListener {
            when {
                mSenha.text.toString().isEmpty() -> Toast.makeText(this, "Favor Informar a senha", Toast.LENGTH_SHORT).show()
                mSenha.text.toString().isNotEmpty() -> Toast.makeText(this, "Sucesso Login", Toast.LENGTH_SHORT).show()
            }
        }


        val mBuilder = AlertDialog.Builder(this)
                .setView(mView)
                .create()

        mClose.setOnClickListener {
            mBuilder.dismiss()
        }

        mBuilder.show()

    }
}
