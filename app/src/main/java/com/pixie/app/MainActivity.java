package com.pixie.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setGravity(Gravity.CENTER);
        TextView textView = new TextView(this);
        textView.setText("Welcome to Pixie!");
        textView.setTextSize(20);

        layout.addView(textView);
        setContentView(layout);
    }
}
