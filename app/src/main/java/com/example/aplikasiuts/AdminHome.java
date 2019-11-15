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

public class AdminHome extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.logout,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.logout){
            AlertDialog.Builder builder = new AlertDialog.Builder(AdminHome.this);

            builder.setMessage("Apakah anda yakin untuk logout?")
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(AdminHome.this, "Batal Logout", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences prefs = AdminHome.this.getSharedPreferences("prefs_file",MODE_PRIVATE);

                            String statusLogin = prefs.getString("isLogin",null);
                            SharedPreferences.Editor edit = prefs.edit();
                            edit.putString("isLogin" , null);
                            edit.commit();

                            Intent intent = new Intent(AdminHome.this, SplashScreen.class);
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
        setContentView(R.layout.activity_admin_home);

        ImageButton btnDataDiriAdm = (ImageButton)findViewById(R.id.btnDataDiriAdmin);
        btnDataDiriAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, DataDiriAdmin.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarDosen = (ImageButton)findViewById(R.id.btnDaftarDosen);
        btnDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, RecyclerViewListDsn.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKrs = (ImageButton)findViewById(R.id.btnKelolaKrs);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, RecyclerViewKrs.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarMatkul = (ImageButton)findViewById(R.id.btnDaftarMatkul);
        btnDaftarMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, RecyclerViewMatkul.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarMhs = (ImageButton)findViewById(R.id.btnDaftarMhs);
        btnDaftarMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, RecyclerViewMahasiswa.class);
                startActivity(intent);
            }
        });
    }
}
