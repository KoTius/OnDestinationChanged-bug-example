package com.kotius.ondestinationchangedlistenerbugexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)
        navController.addOnDestinationChangedListener { _, destination, arguments ->
            // arguments is null here but we have some arguments with default values.
            Log.d("kotiusLogs", "MainActivity -> onDestinationChanged arguments:$arguments")
            // But destination object knows about arguments tho.
            Log.d("kotiusLogs", "MainActivity -> onDestinationChanged at the same time destination.arguments.size:${destination.arguments.size}")

            // This bug reproduces only for destination which are launched via startDestination
        }
    }
}
