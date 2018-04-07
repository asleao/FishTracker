package com.example.aleao.fishtracker.main

import org.junit.Before
import org.junit.Test

import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

/**
 * Local Unit Test for the MainPresenter
 */
class MainPresenterTest {

    @Mock
    val mView = mock(MainContract.MvpView::class.java)

    val mPresenter: MainPresenter by lazy {
        MainPresenter(mView)
    }

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun handleSignInButtonClick() {
        mPresenter.handleSignInButtonClick()
        verify(mView).showSignInScreen()
    }

    @Test
    fun handleSignUpButtonClick() {
        mPresenter.handleSignUpButtonClick()
        verify(mView).showSignUpScreen()
    }
}