package com.xingyun.evendemo.livedata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val userName: LiveData<String> = MutableLiveData()

    val password: LiveData<String> = MutableLiveData()



    fun login() {

    }

}