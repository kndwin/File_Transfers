package com.thesis.filetransfers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openClientView(View view) {
        // Get intent and open view (google how to do that)
        Intent intent = new Intent(this, ClientActivity.class);
        startActivity(intent);
    }

    public void openDevView(View view) {
        Intent intent = new Intent(this, DeveloperActivity.class);
        startActivity(intent);
    }
}
