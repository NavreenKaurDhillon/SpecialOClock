package com.example.specialoclock.ui.fragments.authscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        private fun validateUserData() {
//            if (fragmentLoginScreenBinding.emailET.text?.length ?: String == 0) {
//                fragmentLoginScreenBinding.emailET.error = "Email can't be empty"
//                fragmentLoginScreenBinding.emailET.requestFocus()
//            } else if (!isEmailValid(fragmentLoginScreenBinding.emailET.text.toString())) {
//                fragmentLoginScreenBinding.emailET.error = "Please enter valid email"
//                fragmentLoginScreenBinding.emailET.requestFocus()
//            } else if (fragmentLoginScreenBinding.passwordET.text?.length ?: String == 0) {
//                fragmentLoginScreenBinding.passwordET.error = "Password can't be empty"
//                fragmentLoginScreenBinding.passwordET.requestFocus()
//            } else if (!isValidPassword(fragmentLoginScreenBinding.passwordET.text.toString())) {
//                fragmentLoginScreenBinding.passwordET.error =
//                    "Password must contain at least 6 characters including Upper/Lower case, 1 numeric digit and 1 special character"
//                fragmentLoginScreenBinding.passwordET.requestFocus()
//            } else if (fragmentLoginScreenBinding.passwordET.text.toString() < 8.toString()) {
//                fragmentLoginScreenBinding.passwordET.error =
//                    "Password must contain at least 6 characters including Upper/Lower case, 1 numeric digit and 1 special character"
//                fragmentLoginScreenBinding.passwordET.requestFocus()
//            }
//            else{
//                findNavController().navigate(R.id.action_loginFragment_to_flightsFragment)
//            }
//        }

    }
}