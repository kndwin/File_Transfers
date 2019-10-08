package com.thesis.filetransfers;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DeveloperActivity extends AppCompatActivity {

    private static final int BUFFER_SIZE = 4096;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_acitivity);
    }

    public void downloadFile(View view) {
        FTPConnectionMethods connect = new FTPConnectionMethods();
        Log.d("DeveloperActivity", "Someone called me!");
        connect.helloTag();
    }

}
