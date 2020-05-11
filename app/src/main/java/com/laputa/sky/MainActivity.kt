package com.laputa.sky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * git代码管理
 *
 *  《分支》                                《周期》                    《说明》
 * 【master】                              常驻分支                   主分支，有且只有一个。提供给用户使用的版本，都在这个分支上发布。需tag。
 * 【dev】                                 常驻分支                   日常开发分支，测试通过，由主分支合并dev对外发布。
 *  hotFixs/bugFixs                        补丁分支                   正式发布后，出现bug，创建的bug修复分支。从master分出来的，修复后合并到master和dev，如果存在release，则同样合并到。
 *  releases                               预发分支                   发布正式版本之前，即合并到master之前，预发布的版本进行测试的分支。测试结束后，合并到dev和master分支，并删除。
 *  features                               功能分支                   临时分支，从dev分支分出来的，开发完又dev合并，然后删除。
 *
 *  ..................................................................................................................................................................
 *
 * 产品分支（特殊情况）
 * 【product】                             常驻分支                   特殊的项目，独立于master分支，不会合并到master，区别迭代。
 * dev-product
 * features-product
 * releases-product
 * hotFixs-product/bugFixs-prodcut
 *
 * product分支，如果有相同业务功能的，可以从master合并进product？
 *
 * 以下个人认识原则：（是否合理？）
 *
 * 常驻分支不要进行直接修改，开启新的分支修改。切记！！！
 *
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

        // 测试公共的代码，是否能同步到product-laputa！！！！
    }

    fun feature02(){
        // 开发新功能02
    }

    fun feature03(){
        // 开发新功能03
    }
}
