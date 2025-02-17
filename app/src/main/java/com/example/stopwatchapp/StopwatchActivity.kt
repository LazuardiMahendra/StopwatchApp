package com.example.stopwatchapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stopwatchapp.databinding.ActivityStopwatchBinding
import me.tankery.lib.circularseekbar.CircularSeekBar

class StopwatchActivity : AppCompatActivity() {
    lateinit private var binding: ActivityStopwatchBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStopwatchBinding.inflate(layoutInflater)
        setContentView(binding.main)
        circularSeekBar()
    }

    private fun circularSeekBar() {
        binding.csMain.setOnSeekBarChangeListener(object :
            CircularSeekBar.OnCircularSeekBarChangeListener {
            override fun onProgressChanged(
                circularSeekBar: CircularSeekBar?, progress: Float, fromUser: Boolean
            ) {


            }

            override fun onStartTrackingTouch(seekBar: CircularSeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: CircularSeekBar?) {
                println("seek bar ${seekBar!!.progress}")
            }

        })
    }

}