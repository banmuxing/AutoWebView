package com.xing.web

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.settings.javaScriptCanOpenWindowsAutomatically = true

        web.webViewClient = WebViewClient()

        // 改成你的导航网址
        web.loadUrl("http://open.xingbingxin.top:3002")

        setContentView(web)
    }
}
