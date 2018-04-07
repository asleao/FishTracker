package com.example.aleao.fishtracker.main

/**
 * Defines contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}
 */
interface MainContract {
    interface MvpView {
        fun showSignInScreen()

        fun showSignUpScreen()
    }

    interface Presenter {
        fun handleSignInButtonClick()

        fun handleSignUpButtonClick()
    }
}