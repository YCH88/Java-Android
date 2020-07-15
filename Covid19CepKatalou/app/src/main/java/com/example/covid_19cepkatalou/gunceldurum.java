package com.example.covid_19cepkatalou;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.widget.Toast;

public class gunceldurum extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunceldurum);

        webView=findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

        final ProgressDialog progressDialog = ProgressDialog.show(this, "Yükleniyor...",
                "Sayfa Yükleniyor...", true);

        webView.setWebViewClient(new WebViewClient() {

            public void onReceivedError(WebView view, int errorCode,
                                        String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Sayfa Yüklenemedi!",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (progressDialog.isShowing())
                    progressDialog.dismiss();
            }
        });

        webView.loadUrl("https://covid19.saglik.gov.tr/");

    }
}
