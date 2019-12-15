package com.sandra.tecuido.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;
import com.sandra.tecuido.data.CitaMedica;

import java.util.ArrayList;

public class CitasMedicasAdapter extends RecyclerView.Adapter<CitasMedicasAdapter.Holder> {
    private ArrayList<CitaMedica> listaMedica;

    public CitasMedicasAdapter(ArrayList<CitaMedica> listaMedica) {
        this.listaMedica = listaMedica;
    }

    @NonNull
    @Override
    public CitasMedicasAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_citasmedicas, parent,false);
        return new CitasMedicasAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CitasMedicasAdapter.Holder holder, int position) {
        holder.nombreCentro.setText(listaMedica.get(position).getNombreCentro());
        holder.fechaMedica.setText(listaMedica.get(position).getDate());
        holder.localizacion.setText(listaMedica.get(position).getLocalizacion());
        holder.acompañante.setText(listaMedica.get(position).getAcompañante());
        holder.nombreEspecialista.setText(listaMedica.get(position).getNameDoctor());
    }

    @Override
    public int getItemCount() {
        return listaMedica.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        private TextView nombreCentro, nombreEspecialista, localizacion, acompañante,fechaMedica;

        Holder(@NonNull View itemView) {
            super(itemView);

            nombreCentro = itemView.findViewById(R.id.nombreCentroSalud);
            nombreEspecialista = itemView.findViewById(R.id.nombreEspecialista);
            acompañante = itemView.findViewById(R.id.acompañante);
            localizacion = itemView.findViewById(R.id.localizacion);
            fechaMedica = itemView.findViewById(R.id.date);
        }
    }
}
