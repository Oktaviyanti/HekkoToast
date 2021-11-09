package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        ++mCount;

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        if (mToast == null) {
            mToast = Toast.makeText(MainActivity.this, "Count : " + 0, Toast.LENGTH_SHORT);
        }
        mToast.setText("Count : " + mCount);
        mToast.show();
    }

    public void reset(View view) {
        mShowCount.setText("0");
        mCount = 0;
    }
}