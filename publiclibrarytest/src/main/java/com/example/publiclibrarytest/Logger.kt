package com.example.publiclibrarytest

import android.util.Log

object Logger {
    private const val TAG = "Logger"

    fun printLibraryLog(){
        Log.d(TAG, "Testing library log")
    }
}