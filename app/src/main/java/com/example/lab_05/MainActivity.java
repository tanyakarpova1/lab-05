package com.example.lab_05;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_data = findViewById(R.id.txt_data);
    }

    public void on_dialog_click(View v)
    {
        String s = txt_data.getText().toString();

        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("abc", s);

        startActivityForResult(i, 5555);

    }

    public void on_exit_click(View v)
    {
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        if (requestCode == 555)
        {
            if (data !=null)
            {
                String s = data.getStringExtra("qwe");
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}