package com.fall2018.cs315.mymovielist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MovieWebpage extends AppCompatActivity {
    public static final String WEB_URL = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_webpage_activity);

        String url = getIntent().getStringExtra(WEB_URL);

        WebView view = (WebView) findViewById(R.id.webview);
        view.loadUrl(url);

    }


}
