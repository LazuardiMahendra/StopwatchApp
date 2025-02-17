package com.example.stopwatchapp

class CountDownTimer(private val milisInFuture: Long, private val countDownInterval: Long) {

    private var millisUntilFinished = milisInFuture

    private class InternalTimer(
        private val parent : CountDownTimer
    )

}