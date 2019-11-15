package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasiuts.R;

public class CreateMahasiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mahasiswa);
        this.setTitle("SI KRS - Hai Admin");

        Button btnSimpanKrs = (Button)findViewById(R.id.btnSimpanMhs);
        btnSimpanKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMahasiswaActivity.this, AdminHome.class);
                startActivity(intent);
            }
        });
    }
}