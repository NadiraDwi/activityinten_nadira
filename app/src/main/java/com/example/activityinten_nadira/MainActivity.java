package com.example.activityinten_nadira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private int hitung=0;
    private TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button daftar = findViewById(R.id.daftar);
        daftar.setOnClickListener(this);

        Button masok = findViewById(R.id.hitung);
        daftar.setOnClickListener(this);

        Bundle activity2Data = getIntent().getExtras();
        if (activity2Data==null){
            return;
        }
        String namaMessage = activity2Data.getString("namaMessage");
        final EditText editName = (EditText) findViewById(R.id.editName);
        editName.setText(namaMessage);

        String passMessage = activity2Data.getString("passMessage");
        final EditText editPass = (EditText) findViewById(R.id.editPass);
        editPass.setText(passMessage);


//        String[] arrName = {"Samsung","Sony","Apple","LG","Motorola","HTC","Acer","Lenovo","Oppo","Nokia","BlackBerry","Hua wei","ZTE","Meizu","HP","Asus","Panasonic"};
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrName);
//        ListView anu = (ListView) findViewById(R.id.id_list);
//        anu.setAdapter(adapter);
    }

//    public void daftar(View view) {
//        Toast toast = Toast.makeText(this,"Button sign up ditekan",Toast.LENGTH_SHORT);
//        toast.show();
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.daftar:
                Intent pindahIntent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pindahIntent);
                break;
        }
    }



//    public void toast(View view) {
//        Toast toast=Toast.makeText(this, R.string.message, Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    public void count(View view) {
//        tampil=(TextView)findViewById(R.id.show_count);
//        hitung ++;
//        tampil.setText(Integer.toString(hitung));
//    }
//
//    public void back(View view) {
//        tampil=(TextView)findViewById(R.id.show_count);
//        hitung --;
//        tampil.setText(Integer.toString(hitung));
//    }
}
