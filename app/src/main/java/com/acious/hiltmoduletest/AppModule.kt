package com.acious.hiltmoduletest

import android.content.Context
import com.acious.hiltmoduletest.common.LoggingProvider
import com.acious.hiltmoduletest.feature.ToastLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    @Provides
//    fun provideToastLogger(@ApplicationContext context: Context
//        // Potential dependencies of this type
//    ): LoggingProvider {
//        return ToastLogger(context)
//    }

    // LoggingProvider를 따르는 실제 구현체라면 어떤것이든지 주입가능.
    // 상황에따라 Toast로 로깅을 하는 구현체로 바로 변경가능.
    @Provides
    fun provideLogcatLogger(): LoggingProvider {
        return LogcatLogger()
    }
}