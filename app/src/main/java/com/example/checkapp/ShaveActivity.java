package com.example.checkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;

public class ShaveActivity extends AppCompatActivity {

    String s,s2;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shave);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //this.setFinishOnTouchOutside(false);
        s = "횟수 : 00 ";
        s2 = "알림횟수 : 00 ";
        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t1.setText(s);
        t2.setText(s2);
    }
}
