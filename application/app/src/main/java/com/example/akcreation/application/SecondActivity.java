package com.example.akcreation.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        username =(TextView)findViewById(R.id.tv_username);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        String name = b.getString("key");

        username.setText("Welcome " + name);

    }
}
