package com.example.karan.yummly2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Thread th = new Thread(){
            public void run()
            {
                try{
                    sleep(3000);
                    Intent ob= new Intent(getApplicationContext(),Login.class);
                    startActivity(ob);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        th.start();
    }
}
