package com.example.husa.test.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.view.ViewGroup

import com.example.husa.test.R
import com.example.husa.test.callback.LoginActivityCallback
import android.R.attr.data
import android.databinding.DataBindingUtil
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import com.example.husa.test.databinding.FragmentLoginBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RegisterFragment : Fragment() ,LoginActivityCallback{
   var binding: FragmentLoginBinding? = null

    //  private var activityLoginBinding: FragmentLoginBinding?=null
    override fun onLoginClick(view: View) {

    }

    override fun onRegisterClick(view: View) {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

     //   val root = inflater!!.inflate(R.layout.fragment_login, container, false)
         binding  = FragmentLoginBinding.inflate(inflater,container,false )
        var myView  = binding!!.root
        return myView
    }

    private fun activityView() {
        binding!!.editsername?.setOnEditorActionListener(object : TextView.OnEditorActionListener {
            override fun onEditorAction(v: TextView, actionId: Int, event: KeyEvent?): Boolean {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    val username = binding!!.editsername.text
                  
                  
                    return true
                }
                return false
            }
        })
    }


}
