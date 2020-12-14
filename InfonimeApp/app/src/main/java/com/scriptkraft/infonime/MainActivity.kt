package com.scriptkraft.infonime

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "MainActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.google.com"
        var responseFromRequest: String = ""
// Request a string response from the provided URL.
        val stringRequest = StringRequest(Request.Method.GET, url,
                { response ->
                    // Display the first 500 characters of the response string.
                    responseFromRequest =response.substring(0, 500)
                },
                { responseFromRequest ="That didn't work!"})

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    Log.d(TAG,responseFromRequest)

    }
}