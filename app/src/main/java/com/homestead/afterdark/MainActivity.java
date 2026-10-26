package com.homestead.afterdark;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) { super.onCreate(b); getWindow().getDecorView().setSystemUiVisibility(5894|1024|512); WebView w=new WebView(this); w.setBackgroundColor(0xff050914); w.getSettings().setJavaScriptEnabled(true); w.getSettings().setDomStorageEnabled(true); w.setWebViewClient(new WebViewClient()); setContentView(w); w.loadUrl("file:///android_asset/index.html"); }
}