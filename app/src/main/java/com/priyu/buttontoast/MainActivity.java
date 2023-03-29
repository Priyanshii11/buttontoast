package com.priyu.buttontoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn1 =findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("test", "hello");
            Toast.makeText(MainActivity.this,"i am black button", Toast.LENGTH_SHORT).show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("test", "world");
                Toast.makeText(MainActivity.this,"i am red button", Toast.LENGTH_LONG).show();
            }
        });
    }
}