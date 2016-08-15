package com.example.karan.yummly2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about_us);
        WebView webview = (WebView)findViewById(R.id.webView3);
        webview.getSettings().setJavaScriptEnabled(true);
        String s="<html><body><h1>ABOUT US...</h1><h2>Hello friends,this application is all about a grocery store. As we know a grocery store is a retail store that primarily sells food. A grocer is a bulk seller of food. Grocery stores often offer non-perishable food that is packaged in cans, bottles and boxes, with some also having fresh produce, butchers, delis, and bakeries. Large grocery stores that stock significant amounts of non-food products, such as clothing and household items, are called supermarkets. Some large supermarkets also include a pharmacy and an electronics section.</h2><h2><b> This application is all about buying products online as it is convenient to shop online rather than to go to the supermarket.</b></h2><h1>for more details log on to: www.grocerystoreonline.com</h1><h1>Contact us:9834554310</h1></body></html>";
        webview.loadData(s, "text/html; charset=utf-8", "UTF-8");


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
