package com.example.apple.project4;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by apple on 03/06/17.
 */
public class WebViewController extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
