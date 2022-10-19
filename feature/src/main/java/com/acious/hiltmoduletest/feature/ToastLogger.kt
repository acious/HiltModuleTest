package com.acious.hiltmoduletest.feature

import android.content.Context
import android.widget.Toast
import com.acious.hiltmoduletest.common.LoggingProvider
import dagger.hilt.android.qualifiers.ApplicationContext

class ToastLogger(@ApplicationContext private val applicationContext: Context) : LoggingProvider {
    override fun executeLogging(tag: String, log: String) {
        Toast.makeText(applicationContext, "$log // $tag", Toast.LENGTH_SHORT).show()
    }
}