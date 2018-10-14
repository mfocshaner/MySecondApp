package com.example.michael.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view) {
        //Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }


    /**
     * Increases count by 1
     * @param view -- the view that is clicked
     */
    public void countMe(View view) {
        //Toast myToast = Toast.makeText(this, message, duration);
        TextView showCountView = (TextView) findViewById(R.id.textView);

        String countString = showCountView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;

        showCountView.setText(count.toString());
    }

    public void randomMe(View view) {
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView showCountView = (TextView) findViewById(R.id.textView);
        String countString = showCountView.getText().toString();
        Integer count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT, count);

        startActivity(randomIntent);
    }
}
