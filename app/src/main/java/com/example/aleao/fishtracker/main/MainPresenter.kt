package com.example.aleao.fishtracker.main

import android.view.View

/**
 * Responsable for handling actions from the View and updating the UI as required.
 */
class MainPresenter(val mView: MainContract.MvpView) : MainContract.Presenter {
    override fun handleSignInButtonClick(view:View) {
        mView.showSignInScreen()
    }

    override fun handleSignUpButtonClick(view: View) {
        mView.showSignUpScreen()
    }

}