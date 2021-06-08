package com.projectakhir.foodine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.projectakhir.foodine.AllMethod.apiToken
import com.projectakhir.foodine.MainApp.MainActivity
import com.projectakhir.foodine.SignInUp.OnBoarding.OnBoardingActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        val timer = object : Thread() {
            override fun run() {
                try {
                    synchronized(this) { sleep(3000) }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    //TODO : if apiToken is stated, intent to MainApplication
                    if(apiToken.isEmpty()){
                        val intent = Intent(this@SplashScreenActivity, OnBoardingActivity::class.java)
                        startActivity(intent)
                    } else{
                        val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                        startActivity(intent)
                    }
                    finish()
                }
            }
        }
        timer.start()
    }
}