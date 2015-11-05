package com.example.sal.cs301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;



public class KioskActivity extends AppCompatActivity {

    private WebView mWebView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_kiosk);


        mWebView = (WebView) findViewById(R.id.web_content);
        mWebView.getSettings().setJavaScriptEnabled(true);


        mWebView.loadUrl("http://www.google.com/nexus/6/");
    }

    @Override
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);


        getActionBar().hide();


        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        //provisionOwner();
    }

}
