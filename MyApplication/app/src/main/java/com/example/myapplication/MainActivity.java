package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {
    private Button InBtn;
    private Button OutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化 Firebase
        FirebaseApp.initializeApp(this);

        InBtn =  findViewById(R.id.inbtn);
        OutBtn = findViewById(R.id.outbtn);

        InBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳轉頁面
                Intent intent = new Intent(MainActivity.this, In.class);
                startActivity(intent);
            }
        });

        OutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳轉頁面
                Intent intent = new Intent(MainActivity.this, out.class);
                startActivity(intent);
            }
        });
    }
}
