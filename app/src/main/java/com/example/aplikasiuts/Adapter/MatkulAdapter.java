package com.example.aplikasiuts.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplikasiuts.CreateMatkulActivity;
import com.example.aplikasiuts.Model.Matkul;
import com.example.aplikasiuts.MainActivity;
import com.example.aplikasiuts.R;

import java.util.ArrayList;

public class MatkulAdapter extends RecyclerView.Adapter<MatkulAdapter.ViewHolder> {
    private ArrayList<Matkul> dataList;
    private Context context;
    public MatkulAdapter (ArrayList<Matkul> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_matkul,parent,false); //
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { //gunanya utk memasukkan data
        holder.txtKodeMk.setText(dataList.get(position).getKodeMk());
        holder.txtNamaMk.setText(dataList.get(position).getNamaMk());
        holder.txtHari.setText(dataList.get(position).getHari());
        holder.txtSesi.setText(dataList.get(position).getSesi());
        holder.txtJmlSks.setText(dataList.get(position).getSks());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(context != null){
                    Intent intent = new Intent(context, CreateMatkulActivity.class);
                    context.startActivity(intent);}
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null)? dataList.size() : 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKodeMk, txtNamaMk, txtHari, txtSesi, txtJmlSks;
        private CardView cv;

        public ViewHolder(View view){
            super(view);
            txtKodeMk = view.findViewById(R.id.txtKodeMk);
            txtNamaMk = view.findViewById(R.id.txtNamaMk);
            txtHari = view.findViewById(R.id.txtHariMk);
            txtSesi = view.findViewById(R.id.txtSesiMk);
            txtJmlSks = view.findViewById(R.id.txtJmlSks);
            cv = view.findViewById(R.id.cvMatkul);
        }
    }
}