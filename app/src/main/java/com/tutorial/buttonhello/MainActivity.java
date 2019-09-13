package com.tutorial.buttonhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    Button showText;
    TextView showTextLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = (Button)findViewById(R.id.main_btn_show);
        showText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showTextLabel.getVisibility() == View.VISIBLE) {
                    showTextLabel.setVisibility(View.INVISIBLE);
                } else {
                    showTextLabel.setVisibility(View.VISIBLE);
                }
            }
        });
        showTextLabel = (TextView)findViewById(R.id.main_lbl_hello);

        Log.e(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void onButtonClicked(View sender) {
        Log.e(TAG, "Hello World");

        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }

    public void onNextClicked(View sender) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
