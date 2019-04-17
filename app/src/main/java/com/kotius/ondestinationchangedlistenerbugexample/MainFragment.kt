package com.kotius.ondestinationchangedlistenerbugexample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment


class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val args = MainFragmentArgs.fromBundle(arguments!!)
        Log.d("kotiusLogs", "MainFragment -> onCreate() booleanArgValue:${args.someBooleanArg} stringArgValue:${args.someStringArg}")
    }
}