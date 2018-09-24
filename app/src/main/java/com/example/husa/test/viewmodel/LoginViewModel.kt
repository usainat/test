package com.example.husa.test.viewmodel

import android.content.Context
import android.databinding.ObservableBoolean
import android.text.TextWatcher
import android.view.View
import com.example.husa.test.TextWatcherAdapter

class LoginViewModel (val context: Context){
lateinit var editTextUsernameValue :String
    var isSearch: ObservableBoolean = ObservableBoolean(false)
    fun onClickSearch(view: View) {

    }

    fun getUsernameEditTextWatcher(): TextWatcher {
        return object : TextWatcherAdapter() {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                super.onTextChanged(s, start, before, count)
                editTextUsernameValue = s.toString()
                isSearch.set(s?.length!! > 0)
            }
        }
    }




}