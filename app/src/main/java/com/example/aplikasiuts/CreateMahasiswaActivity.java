package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class CreateMahasiswaActivity extends AppCompatActivity {
    EditText editNamaMhs, editNimMhs, editAlamatMhs, editEmailMhs;
    String namaMhs, nim, alamatMhs, emailMhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mahasiswa);
        this.setTitle("SI KRS - Hai Admin");

        Button btnSimpanKrs = (Button) findViewById(R.id.btnSimpanMhs);
        btnSimpanKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMahasiswaActivity.this, AdminHome.class);
                startActivity(intent);
            }
        });


        editNama = findViewById(R.id.editNamaMhs);
        editNim = findViewById(R.id.editNimMhs);
        editAlamat = findViewById(R.id.editAlamatMhs);
        editEmail = findViewById(R.id.editEmailMhs);

    }


    public void validasiData(){
        namaMhs = editNamaMhs.getText().toString();
        nim = editNimMhs.getText().toString();
        alamatMhs = editAlamatMhs.getText().toString();
        emailMhs = editEmailMhs
                .getText().toString();

        if (TextUtils.isEmpty(namaMhs)){
            editNamaMhs.setError ("Nama Harus Diisi");
        }else if (TextUtils.isEmpty(nim)) {
            editNimMhs.setError( "NIM Harus Diisi" );
        }
        if (TextUtils.isEmpty(alamatMhs)) { editAlamatMhs.setError( "Alamat Harus Doisi" );
        }
        if (TextUtils.isEmpty(emailMhs)) {
            editEmailMhs.setError( "Email Harus Diisi" );
        }

    }
}



