package com.example.aplikasiuts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.aplikasiuts.Model.Dosen;
import com.example.aplikasiuts.RecyclerViewKrs;
import com.example.aplikasiuts.R;

public class DosenHome extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.logout,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.logout){
            AlertDialog.Builder builder = new AlertDialog.Builder(DosenHome.this);

            builder.setMessage("Apakah anda yakin untuk logout?")
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(DosenHome.this, "Batal Logout", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences prefs = DosenHome.this.getSharedPreferences("prefs_file",MODE_PRIVATE);

                            String statusLogin = prefs.getString("isLogin",null);
                            SharedPreferences.Editor edit = prefs.edit();
                            edit.putString("isLogin" , null);
                            edit.commit();

                            Intent intent = new Intent(DosenHome.this, SplashScreen.class);
                            startActivity(intent);
                        }
                    });

            AlertDialog dialog = builder.create(); dialog.show();
        }
        return  true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen_home);
        this.setTitle("SI KRS - Hai Dosen");

        ImageButton btnDataDiriDsn = (ImageButton)findViewById(R.id.btnDataDiriDosen);
        btnDataDiriDsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosenHome.this, DataDiriDosen.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKelas = (ImageButton)findViewById(R.id.btnLihatKelas);
        btnDaftarKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosenHome.this, RecyclerViewKelas.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKrs = (ImageButton)findViewById(R.id.btnDaftarKrs);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosenHome.this, RecyclerViewKrs.class);
                startActivity(intent);
            }
        });
    }
}