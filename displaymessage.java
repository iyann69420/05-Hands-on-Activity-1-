package com.example.salgado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class displaymessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymessage);

        TextView result = findViewById(R.id.result);
        Intent intent = getIntent();
        String Message = intent.getStringExtra("result");
        result.setText(Message);
    }
}