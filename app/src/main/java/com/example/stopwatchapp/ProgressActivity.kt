package com.example.stopwatchapp

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stopwatchapp.databinding.ActivityProgressBinding
import me.tankery.lib.circularseekbar.CircularSeekBar

class ProgressActivity : AppCompatActivity() {

    private lateinit var cirleSeekBar: CircularSeekBar
    private var progressInt: Float = 0F

    private lateinit var binding: ActivityProgressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.circularSeekBar.max = 100F
        while (progressInt < 100) {
            progressInt++
        }
        animantionProgress(progressInt)


        binding.circularSeekBar.setOnSeekBarChangeListener(object :
            CircularSeekBar.OnCircularSeekBarChangeListener {
            override fun onProgressChanged(
                circularSeekBar: CircularSeekBar?, progress: Float, fromUser: Boolean
            ) {
                binding.tvProgress.setText(progress.toInt().toString())
            }

            override fun onStartTrackingTouch(seekBar: CircularSeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(seekBar: CircularSeekBar?) {
                TODO("Not yet implemented")
            }

        })

    }

    private fun animantionProgress(targetProgress: Float) {
        ObjectAnimator.ofFloat(binding.circularSeekBar, "Progress", targetProgress).apply {
            duration = 10000
            start()
        }
    }
}