package com.example.aleao.fishtracker.main

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.aleao.fishtracker.R
import kotlinx.android.synthetic.main.custom_dialog.view.*

/**
 * Responsable for handling actions from the View and updating the UI as required.
 */
class MainPresenter(val mView: MainContract.MvpView) : MainContract.Presenter {
    override fun handleDialogButtonClick(view: View) {
        val mView = LayoutInflater.from(view.context).inflate(R.layout.custom_dialog, null)
        val mClose = mView.close_dialog
        val mSenha = mView.senha_informada
        val mOk = mView.ok

        mOk.setOnClickListener {
            when {
                mSenha.text.toString().isEmpty() -> Toast.makeText(view.context, "Favor Informar a senha", Toast.LENGTH_SHORT).show()
                mSenha.text.toString().isNotEmpty() -> Toast.makeText(view.context, "Sucesso Login", Toast.LENGTH_SHORT).show()
            }
        }


        val mBuilder = AlertDialog.Builder(view.context)
                .setView(mView)
                .create()

        mClose.setOnClickListener {
            mBuilder.dismiss()
        }

        mBuilder.show()
    }

    override fun handleSignInButtonClick(view: View) {
        mView.showSignInScreen()
    }

    override fun handleSignUpButtonClick(view: View) {
        mView.showSignUpScreen()
    }

}