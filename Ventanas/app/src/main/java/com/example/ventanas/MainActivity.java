package com.example.ventanas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;




public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intento = new Intent(MainActivity.this,
                        MainActivity5.class);
                startActivity(intento);
            }
        });
        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intento = new Intent(MainActivity.this,
                        MainActivity3.class);
                startActivity(intento);
            }
        });
    }
}

