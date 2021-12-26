package com.akinguldere.mackoliktestcase.ui.news

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.akinguldere.mackoliktestcase.R
import com.akinguldere.mackoliktestcase.base.BaseActivity
import com.akinguldere.mackoliktestcase.databinding.ActivityWebViewBinding

class WebViewActivity : BaseActivity() {

    private val binding by binding<ActivityWebViewBinding>(R.layout.activity_web_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val url = intent.getStringExtra("url")

        binding.apply {
            webView.settings.javaScriptEnabled = true

            webView.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                    view?.loadUrl(url!!)
                    return true
                }
            }
            webView.loadUrl(url!!)

            backButton.setOnClickListener { finish() }
        }
    }
}