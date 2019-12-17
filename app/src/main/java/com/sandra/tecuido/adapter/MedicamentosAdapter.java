package com.sandra.tecuido.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;
import com.sandra.tecuido.data.Medicamento;

import java.util.ArrayList;
import java.util.List;

public class MedicamentosAdapter extends RecyclerView.Adapter<MedicamentosAdapter.Holder> {
    private List<Medicamento> listaMedicamentos;

    public MedicamentosAdapter(List<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medicamentos, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.nombre.setText(listaMedicamentos.get(position).getName());
        holder.fechacaducidad.setText(listaMedicamentos.get(position).getExpirationdate());
        holder.dosis.setText(listaMedicamentos.get(position).getDosis());
        holder.veces.setText(String.valueOf(listaMedicamentos.get(position).getTimes()));
        holder.observaciones.setText(listaMedicamentos.get(position).getObservaciones());

    }

    @Override
    public int getItemCount() {
        return listaMedicamentos.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView nombre, fechacaducidad, dosis, veces, observaciones;

        public Holder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombreMecdicamento);
            fechacaducidad = itemView.findViewById(R.id.fechaMedicamento);
            dosis = itemView.findViewById(R.id.dosisPorToma);
            veces = itemView.findViewById(R.id.numeroTomas);
            observaciones = itemView.findViewById(R.id.descripcionObservaciones);
        }
    }
}
