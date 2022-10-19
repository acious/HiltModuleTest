package com.acious.hiltmoduletest.common

/**
 * 이러한 인터페이스는 이것을 Implement 하기위해 가능한 Common이나 다른앱에서도 사용될만한 기능이면 foundation으로 올리는게 좋음.
 */
interface LoggingProvider {
    fun executeLogging(tag: String, log: String)
}