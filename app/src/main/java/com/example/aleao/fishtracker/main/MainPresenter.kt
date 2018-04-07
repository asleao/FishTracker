package com.example.aleao.fishtracker.main

/**
 * Responsable for handling actions from the View and updating the UI as required.
 */
class MainPresenter(val mView: MainContract.MvpView) : MainContract.Presenter {
    override fun handleSignInButtonClick() {
        mView.showSignInScreen()
    }

    override fun handleSignUpButtonClick() {
        mView.showSignUpScreen()
    }

}