package com.example.aplikasiuts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.aplikasiuts.Adapter.MatkulAdapter;
import com.example.aplikasiuts.Model.Matkul;
import com.example.aplikasiuts.R;

import java.util.ArrayList;

public class RecyclerViewMatkul extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MatkulAdapter matkulAdapter;
    private ArrayList<Matkul> mkList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewMatkul.this,CreateMatkulActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_matkul);
        this.setTitle("SI KRS - Hai Admin");

        tambahData();

        recyclerView = findViewById(R.id.rvMatkul);
        matkulAdapter = new MatkulAdapter(mkList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewMatkul.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(matkulAdapter);
    }

    public void tambahData(){
        mkList = new ArrayList<>();
        mkList.add(new Matkul("SI001","Dasar-dasar Pemrograman","Selasa","3","3"));
        mkList.add(new Matkul("SI002","Perbasdat","Jumat","3","2"));
    }
}
