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

import com.example.aplikasiuts.Adapter.DosenAdapter;
import com.example.aplikasiuts.Model.Dosen;


import java.util.ArrayList;

public class RecyclerViewListDsn extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DosenAdapter dosenAdapter;
    private ArrayList<Dosen> dosenList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewListDsn.this,CreateDosenActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list_dsn);
        this.setTitle("SI KRS - Hai Admin");
        tambahData();

        recyclerView = findViewById(R.id.rvDosen);
        dosenAdapter = new DosenAdapter(dosenList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewListDsn.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dosenAdapter);
    }

    private void tambahData(){
        dosenList = new ArrayList<>();
        dosenList.add(new Dosen("001","Katon Wijana", "S.Kom, M.T","katony@staff.ukdw.ac.id","Jl. Kotabaru",R.drawable.siluet));
        dosenList.add(new Dosen("002","Halim Budi Santoso", "Ir. M.T, MBA","hbudi@staff.ukdw.ac.id","Jl. Parangtritis",R.drawable.siluet));
    }
}
