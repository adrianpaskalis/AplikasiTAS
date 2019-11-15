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

import com.example.aplikasiuts.CreateKrsActivity;
import com.example.aplikasiuts.Model.Krs;
import com.example.aplikasiuts.MainActivity;
import com.example.aplikasiuts.R;

import java.util.ArrayList;

public class KrsAdapter extends RecyclerView.Adapter<KrsAdapter.ViewHolder> {
    private ArrayList<Krs> dataList;
    private Context context;
    public KrsAdapter (ArrayList<Krs> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_krs,parent,false); //
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtKodeMk.setText(dataList.get(position).getKodeKrs());
        holder.txtNamaMk.setText(dataList.get(position).getNamaMatkul());
        holder.txtHari.setText(dataList.get(position).getHari());
        holder.txtSesi.setText(dataList.get(position).getSesi());
        holder.txtJmlSks.setText(dataList.get(position).getSks());
        holder.txtJmlMhs.setText(dataList.get(position).getJmlMhs());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(context != null){
                    Intent intent = new Intent(context, CreateKrsActivity.class);
                    context.startActivity(intent);}
            }
        });
    }

    @Override
    public int getItemCount() { //berguna untuk menghitung jumlah data yang ada
        return (dataList != null)? dataList.size() : 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKodeMk, txtNamaMk, txtHari, txtSesi, txtJmlSks, txtJmlMhs;
        private CardView cv;

        public ViewHolder(View view){
            super(view);
            txtKodeMk = view.findViewById(R.id.txtKodeKrs);
            txtNamaMk = view.findViewById(R.id.txtNamaKrs);
            txtHari = view.findViewById(R.id.txtHariKrs);
            txtSesi = view.findViewById(R.id.txtSesiKrs);
            txtJmlSks = view.findViewById(R.id.txtSksKrs);
            txtJmlMhs = view.findViewById(R.id.txtJumlahMhsKrs);
            cv = view.findViewById(R.id.cvKrs);
        }
    }
}
