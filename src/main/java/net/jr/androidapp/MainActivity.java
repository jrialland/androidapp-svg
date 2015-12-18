package net.jr.androidapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private WebView webview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		
		//load web view
		if (webview == null) {
			webview = new WebView(this);
			webview.getSettings().setJavaScriptEnabled(true);
			//bind the web view to this activity
			setContentView(webview);
		}		
		
		webview.loadUrl("file:///android_asset/index.html");
	}

}
