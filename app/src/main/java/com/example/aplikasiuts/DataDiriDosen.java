package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import com.example.aplikasiuts.R;

public class DataDiriDosen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri_dosen);
        this.setTitle("SI KRS - Hai Dosen");

        Button btnSimpanDsn = (Button)findViewById(R.id.btnSimpanDosen);
        btnSimpanDsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataDiriDosen.this, DosenHome.class);
                startActivity(intent);
            }
        });
    }
}
