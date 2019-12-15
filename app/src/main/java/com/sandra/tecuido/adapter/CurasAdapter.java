package com.sandra.tecuido.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;

import java.util.ArrayList;

public class CurasAdapter extends RecyclerView.Adapter<CurasAdapter.Holder> {

    private ArrayList<String> listaCuras;

    public CurasAdapter(ArrayList<String> listaCuras) {
        this.listaCuras = listaCuras;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_curas, parent, false);
        return new CurasAdapter.Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.curas.setText(listaCuras.get(position));

    }

    @Override
    public int getItemCount() {
        return listaCuras.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView curas;

        public Holder(View itemView) {
            super(itemView);
            curas = itemView.findViewById(R.id.itemCuras);
        }
    }
}
