package com.example.myapplication

import android.app.Activity
import android.graphics.Bitmap
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.myBrauzer.webViewClient=WebViewClient()
        binding.myBrauzer.settings.setJavaScriptEnabled(true)


        binding.edText.addTextChangedListener(){
            if (it != null) {
                binding.myBrauzer.loadUrl("https://"+it)
//                binding.myBrauzer.loadUrl("https://www.google.com/search?q="+it)
            }
        }


//        binding.myBrauzer.loadUrl("https://kun.uz/")

//        var myHtmlString="<html><body><h1>Salom Ilhomjon</h1></body></html>"
//        binding.myBrauzer.loadData(myHtmlString,"text/html; charset=UTF-8",null)

    }

    override fun onBackPressed() {
        if (binding.myBrauzer.canGoBack()){
            binding.myBrauzer.goBack()
        }else{
            super.onBackPressed()
        }
    }
//23.03.24 da ozgarish

//   inner class myWebViewClient():WebViewClient(){
//        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
//            super.onPageStarted(view, url, favicon)
//        }
//
//        override fun onPageFinished(view: WebView?, url: String?) {
//            super.onPageFinished(view, url)
////            binding.progressBar.visibility=View.GONE
////            binding.myBrauzer.visibility=View.VISIBLE
//
//        }
//    }




}
