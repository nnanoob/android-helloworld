package com.standardchartered.testengineering.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static String EXTRA_MESSAGE = "EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAuthentication(View v)
    {
        Intent i = new Intent(getApplicationContext(), AuthenticationActivity.class);
        startActivity(i);
    }

    public void switchToCamera(View v)
    {
        Intent i = new Intent(getApplicationContext(), CameraActivity.class);
        startActivity(i);
    }

    public void sendMessage(View v) {
        Intent i = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);
    }
}
