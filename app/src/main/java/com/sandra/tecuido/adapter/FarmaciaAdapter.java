package com.sandra.tecuido.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;
import com.sandra.tecuido.data.Farmacia;

import java.util.ArrayList;

public class FarmaciaAdapter extends RecyclerView.Adapter<FarmaciaAdapter.Holder> {

    private ArrayList<Farmacia> listaFarmacias;

    public FarmaciaAdapter(ArrayList<Farmacia> listaFarmacias) {
        this.listaFarmacias = listaFarmacias;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_farmacia, parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.numeroTelefono.setText(listaFarmacias.get(position).getPhone());
        holder.horario.setText(listaFarmacias.get(position).getTimetable());
        holder.direccion.setText(listaFarmacias.get(position).getAdress());
        holder.nombre.setText(listaFarmacias.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return listaFarmacias.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        private TextView direccion, horario, nombre, numeroTelefono;


        Holder(@NonNull View itemView) {
            super(itemView);

            direccion = itemView.findViewById(R.id.nombreEspecialista);
            horario = itemView.findViewById(R.id.localizacion);
            nombre = itemView.findViewById(R.id.nombreCentroSalud);
            numeroTelefono = itemView.findViewById(R.id.acompañante);
        }
    }
}
