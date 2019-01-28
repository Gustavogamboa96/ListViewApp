package com.cangrejo.listview;

import android.graphics.Color;
import android.graphics.pdf.PdfRenderer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ForwardingListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.io.File;

public class FourthItemActivity extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_item);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setTitle("Inmovilizaciones");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        WebView webview = (WebView) findViewById(R.id.view1);
        webview.getSettings().setJavaScriptEnabled(true);

        WebSettings webSettings = webview.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webSettings.setBuiltInZoomControls(true);

        webview.requestFocusFromTouch();

        webview.setWebViewClient(new WebViewClient());
        webview.setWebChromeClient(new WebChromeClient());

        webview.loadUrl("https://docs.google.com/document/d/e/2PACX-1vQCI2RnpH-RIlyUZawsbX4O5kM9fscB0ISZ_drB7gcc5Ou9CfWJfFyHABsumjpnHRIgyas0JzRD4qW0/pub");








    }
}
