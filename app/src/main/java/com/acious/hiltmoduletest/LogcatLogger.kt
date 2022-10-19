package com.acious.hiltmoduletest

import android.util.Log
import com.acious.hiltmoduletest.common.LoggingProvider

class LogcatLogger : LoggingProvider {
    override fun executeLogging(tag: String, log: String) {
        Log.d(tag, log)
    }
}