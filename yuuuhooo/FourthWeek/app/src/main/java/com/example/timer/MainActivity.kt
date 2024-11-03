package com.example.timer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.timer.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private var isRunning = false
    private var elapsedTime = 0L
    private var startTime = 0L
    private var timerThread: Thread? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonStart.setOnClickListener {
            if (isRunning) {
                // 중지 상태로 변경
                isRunning = false
                binding.buttonStart.text = "재시작"
            } else {
                // 시작 또는 재시작 상태로 변경
                startTime = System.currentTimeMillis() - elapsedTime
                isRunning = true
                binding.buttonStart.text = "중지"

                startTimerThread()
            }
        }

        binding.buttonStop.setOnClickListener {
            // 스톱워치 종료 및 리셋
            isRunning = false
            elapsedTime = 0L
            binding.textTimer.text = formatTime(elapsedTime)
            binding.buttonStart.text = "시작"
        }
    }

    private fun startTimerThread() {
        timerThread = thread {
            while (isRunning) {
                val currentTime = System.currentTimeMillis()
                elapsedTime = currentTime - startTime

                // UI 업데이트는 main thread에서 수행해야 함
                runOnUiThread {
                    binding.textTimer.text = formatTime(elapsedTime)
                }
                Thread.sleep(10) // 10ms 간격으로 업데이트
            }
        }
    }

    private fun formatTime(milliseconds: Long): String {
        val seconds = (milliseconds / 1000) % 60
        val minutes = (milliseconds / (1000 * 60)) % 60
        val millis = milliseconds % 1000 / 10
        return String.format("%02d:%02d:%02d", minutes, seconds, millis)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Activity가 종료될 때 스레드도 정지
        isRunning = false
        timerThread?.interrupt()
    }
}
