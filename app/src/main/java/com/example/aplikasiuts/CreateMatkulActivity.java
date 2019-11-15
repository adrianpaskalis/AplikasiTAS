package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.aplikasiuts.R;

public class CreateMatkulActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private static final String[] hari = {"Senin","Selasa","Rabu","Kamis","Jumat"};
    private static final String[] sesi = {"1","2","3","4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_matkul);

        spinner1 = (Spinner)findViewById(R.id.spinnerDosen);
        ArrayAdapter<String>adapter = new ArrayAdapter<>(CreateMatkulActivity.this,android.R.layout.simple_spinner_item,hari);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        spinner2 = (Spinner)findViewById(R.id.spinnerSesi);
        ArrayAdapter<String>adapterSesi = new ArrayAdapter<>(CreateMatkulActivity.this,android.R.layout.simple_spinner_item,sesi);
        adapterSesi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapterSesi);

        Button btnSimpanMatkul = (Button)findViewById(R.id.btnSimpanMatkul);
        btnSimpanMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMatkulActivity.this, AdminHome.class);
                startActivity(intent);
            }
        });
    }
}
