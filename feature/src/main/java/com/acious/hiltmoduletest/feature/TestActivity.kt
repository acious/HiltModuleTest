package com.acious.hiltmoduletest.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acious.hiltmoduletest.common.LoggingProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

const val TAG = "TestActivity"
@AndroidEntryPoint
class TestActivity : AppCompatActivity() {

    @Inject
    lateinit var logcatLogger: LoggingProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        // 실질적인 동작을 하는 것은 Feature 모듈이 알수없는 App 모듈의 LogcatLogger 인데,
        // LoggingProvider라는 인터페이스를 통해 Hilt로부터 주입을 받아서 기능을 수행할수있게해줌.
        logcatLogger.executeLogging(TAG, "onTestActivity with ")
    }
}