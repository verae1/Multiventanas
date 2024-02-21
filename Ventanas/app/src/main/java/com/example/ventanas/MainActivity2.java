package com.example.ventanas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;




public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intento = new Intent(MainActivity.this,
                        MainActivity.class);
                startActivity(intento);
            }
        });
        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intento = new Intent(MainActivity.this,
                        MainActivity.class);
                startActivity(intento);
            }
        });
    }
}

