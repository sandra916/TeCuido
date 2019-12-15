package com.sandra.tecuido.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;

import java.util.ArrayList;

public class EnfermedadesAdapter extends RecyclerView.Adapter<EnfermedadesAdapter.Holder> {

    private ArrayList<String> listaEnfermedades;

    public EnfermedadesAdapter(ArrayList<String> listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_enfermedades, parent, false);
        return new EnfermedadesAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.enfermedades.setText(listaEnfermedades.get(position));

    }

    @Override
    public int getItemCount() {
        return listaEnfermedades.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView enfermedades;

        public Holder(@NonNull View itemView) {
            super(itemView);
            enfermedades = itemView.findViewById(R.id.itemEnfermedad);
        }
    }
}
