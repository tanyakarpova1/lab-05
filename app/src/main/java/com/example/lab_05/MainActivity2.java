package com.example.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txt_data_alt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_data_alt = findViewById(R.id.txt_data_alt);

        Intent i = getIntent();

        String s = i.getStringExtra("abc");
        txt_data_alt.setText(s);
    }

    public void on_ok_click(View v)
    {
        Intent i = new Intent();

        String s = txt_data_alt.getText().toString();
        i.putExtra("qwe", s);

        setResult(RESULT_OK, i);
        finish();
    }

    public void on_cancel_click(View v)
    {
        setResult(RESULT_CANCELED);
        finish();
    }

}