package com.example.Sinsari_contest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView web;
    WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        web = (WebView)findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl("https://www.naver.com/");
    }
}