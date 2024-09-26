package com.example.mediationproject.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.mediationproject.R

class  LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val timer = object:CountDownTimer(3000, 1000){
            override fun onTick(millisUntilFinished: Long) {
                //действия во время работы таймер
            }

            override fun onFinish() {
                //переход на другой экран
                val intent = Intent(this@LaunchActivity, MainActivity::class.java)
                //активация перехода
                startActivity(intent)
                //закрытие окна
                finish()
            }
        }
        //активация таймера
        timer.start()
    }
}