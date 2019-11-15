package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aplikasiuts.Adapter.KelasAdapter;
import com.example.aplikasiuts.Model.Kelas;
import com.example.aplikasiuts.R;

import java.util.ArrayList;

public class RecyclerViewKelas extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KelasAdapter kelasAdapter;
    private ArrayList<Kelas> kelasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_kelas);

        this.setTitle("SI KRS - Hai Mahasiswa");

        tambahData();

        recyclerView = findViewById(R.id.rvKelas);
        kelasAdapter = new KelasAdapter(kelasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKelas.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kelasAdapter);
    }

    public void tambahData() {
        kelasList = new ArrayList<>();
        kelasList.add(new Kelas("SI001", "Dasar-dasar Pemrograman", "3", "Senin", "Katon", "33"));
        kelasList.add(new Kelas("SI002", "Alpro", "3", "Jumat", "Katon", "40"));
        kelasList.add(new Kelas("SI003", "Perbasdat", "3", "Selasa", "Halim", "30"));
    }
}
