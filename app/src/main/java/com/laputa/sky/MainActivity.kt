package com.laputa.sky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * product ：对于master，这是一个特殊的分支 。即和master是两个线上环境，它的迭代如何进行？
 *
 * 对于master - dev
 * 是否需要product - dev-product来完成特殊的功能（feature）？
 * 且对于相同功能或者bug，是否同步merge到product - dev-product中？
 *
 * 实验开始!
 */
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

        // 特殊版本，此功能在特殊版本里有额外的操作,正常版本则不会有！！！
    }


}
