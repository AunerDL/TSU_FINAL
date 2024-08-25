package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Ejercicio7 extends AppCompatActivity {

    Button salir;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
        WebView webView = (WebView) findViewById(R.id.WebView01);
        webView.setWebViewClient(new Callback());
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webView.loadUrl("http://www.android.com/images/whatsnew/jb-new-logo.png");

        salir=(Button) findViewById(R.id.btnSalir7);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio7.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,
                                                String url) {
            return (false);
        }
    }
}