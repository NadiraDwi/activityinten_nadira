package com.example.activityinten_nadira;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button lanjut = findViewById(R.id.lanjut);
        lanjut.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,MainActivity.class);

        final EditText namaInput = (EditText) findViewById(R.id.namaInput);
        String userMessage = namaInput.getText().toString();
        i.putExtra("namaMessage",userMessage);

        final EditText passInput = (EditText) findViewById(R.id.passInput);
        String passMessage = passInput.getText().toString();
        i.putExtra("passMessage",passMessage);

        startActivity(i);
    }
}
