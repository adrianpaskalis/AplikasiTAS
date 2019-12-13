package com.example.aplikasiuts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateDosenActivity extends AppCompatActivity {
    EditText editNama, editNidn, editAlamat, editEmail, editGelar;
    String nama, nidn, alamat, email, gelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dosen);
        this.setTitle("SI KRS - Hai Admin");

        Button btnDaftarKrs = (Button)findViewById(R.id.btnSimpanDsn);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateDosenActivity.this, AdminHome.class);
                startActivity(intent);
            }
        });

        editNama = findViewById( R.id.editNamaMhs);
        editNidn = findViewById( R.id.editNimMhs);
        editAlamat = findViewById( R.id.editAlamatMhs);
        editEmail = findViewById( R.id.editEmailMhs);
        editGelar = findViewById( R.id.editGelar );

    }

    public void validasiData(){
        nama = editNama.getText().toString();
        nidn = editNidn.getText().toString();
        alamat = editAlamat.getText().toString();
        email = editEmail.getText().toString();
        gelar = editGelar.getText().toString();

        if (TextUtils.isEmpty(nama)){
            editNama.setError ("Nama Harus Diisi");
        }else if (TextUtils.isEmpty(nidn)) {
            editNidn.setError( "NIdn Harus Diisi" );
        }
        if (TextUtils.isEmpty(alamat)) { editAlamat.setError( "Alamat Harus Doisi" );
        }
        if (TextUtils.isEmpty(email)) {
            editEmail.setError( "Email Harus Diisi" );
        }
        if (TextUtils.isEmpty(gelar)) {
            editGelar.setError( "Gelar Harus Diisi" );
        }
    }
}






