package com.example.currentplacedetailsonmap;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class report extends AppCompatActivity {

    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        mywebview = (WebView)findViewById(R.id.webView);
        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfBCPTbV_KvjGUbjDph2YRMfUoU_DR3gJ1DZkGJmaXQKFMIsQ/viewform?usp=sf_link");
        mywebview.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed()
    {
        if(mywebview.canGoBack())
        {
            mywebview.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }

}
