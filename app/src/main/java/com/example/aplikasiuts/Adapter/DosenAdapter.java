package com.example.aplikasiuts.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplikasiuts.CreateDosenActivity;
import com.example.aplikasiuts.Model.Dosen;
import com.example.aplikasiuts.R;

import java.util.ArrayList;

public class DosenAdapter extends RecyclerView.Adapter<DosenAdapter.ViewHolder> {

    private ArrayList<Dosen> dataList;
    private Context context;
    public DosenAdapter (ArrayList<Dosen> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_dosen,parent,false); //
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { //gunanya utk memasukkan data
        holder.txtNidn.setText(dataList.get(position).getNidn());
        holder.txtNamaDosen.setText(dataList.get(position).getNamaDosen());
        holder.txtGelar.setText(dataList.get(position).getGelar());
        holder.txtAlamat.setText(dataList.get(position).getAlamatDsn());
        holder.txtEmail.setText(dataList.get(position).getEmailDsn());
        holder.imgFoto.setImageResource(dataList.get(position).getFotoDsn());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(context != null){
                    Intent intent = new Intent(context, CreateDosenActivity.class);
                    context.startActivity(intent);}
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null)? dataList.size() : 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNidn, txtNamaDosen, txtGelar, txtAlamat, txtEmail;
        private ImageView imgFoto;
        private CardView cv;

        public ViewHolder(View view){
            super(view);
            txtNidn = view.findViewById(R.id.txtNidn);
            txtNamaDosen = view.findViewById(R.id.txtNamaDosen);
            txtGelar = view.findViewById(R.id.txtGelar);
            txtAlamat = view.findViewById(R.id.txtAlamat);
            txtEmail = view.findViewById(R.id.txtEmail);
            imgFoto = view.findViewById(R.id.imgFotoDosen);
            cv = view.findViewById(R.id.cardViewDosen);
        }
    }
}
