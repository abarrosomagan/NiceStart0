package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;


import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Cargas el layout
        setContentView(R.layout.activity_main);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);
        setSupportActionBar(topAppBar);

        SwipeRefreshLayout swipeRefresh = findViewById(R.id.swipeRefresh);
        WebView webView = findViewById(R.id.webView);

//Settings necesarios para webs modernas
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);   // CLAVE
        webView.getSettings().setLoadsImagesAutomatically(true);


        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                swipeRefresh.setRefreshing(false);
            }
            @Override
            public void onReceivedError(
                    WebView view,
                    int errorCode,
                    String description,
                    String failingUrl
            ) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                swipeRefresh.setRefreshing(false);
                Toast.makeText(MainActivity.this,
                        "Error cargando la página",
                        Toast.LENGTH_SHORT).show();
            }
        });

// Carga web iniciamentee
        webView.loadUrl("https://m3.material.io/");

// Swipe de refresco
        swipeRefresh.setOnRefreshListener(() -> {
            String currentUrl = webView.getUrl();
            if (currentUrl == null || currentUrl.isEmpty()) {
                webView.loadUrl("https://m3.material.io/");
            } else {
                webView.reload();
            }
        });

    }

    // Inflar el menú
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_about) {
            Toast.makeText(this, "Acerca de ", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.action_logout) {
            Toast.makeText(this, "Cerrar sesion", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
