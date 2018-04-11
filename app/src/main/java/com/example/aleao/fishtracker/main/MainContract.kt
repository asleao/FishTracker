package com.example.aleao.fishtracker.main

import android.view.View

/**
 * Defines contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}
 */
interface MainContract {
    interface MvpView {
        fun showSignInScreen()

        fun showSignUpScreen()
    }

    interface Presenter {
        fun handleSignInButtonClick(view:View)

        fun handleSignUpButtonClick(view: View)

        fun handleDialogButtonClick(view: View)
    }
}