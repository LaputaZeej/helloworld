package com.laputa.sky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // hotfix 线上修复（测试冲突 hotfix vs feature02）

        // 这段说明 代表tag：v1.0.0标签下的一次bug修复 测试冲突02
        // 这段说明 代表tag：v1.0.0标签下的一次bug修复 02
    }

    fun hello() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun feature01(){
        // feature-01
    }

    fun feature02(){
        // 开发新功能02
    }
}
