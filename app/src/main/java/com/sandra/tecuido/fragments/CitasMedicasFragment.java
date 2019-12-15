package com.sandra.tecuido.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;
import com.sandra.tecuido.adapter.CitasMedicasAdapter;
import com.sandra.tecuido.data.CitaMedica;

import java.util.ArrayList;

public class CitasMedicasFragment extends Fragment {

    private RecyclerView recyclerView;
    private CitasMedicasAdapter citasMedicasAdapter = new CitasMedicasAdapter(getcitasmedicas());

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.citasmedicas_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.listaCitasMedicas);
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(citasMedicasAdapter);
    }

    private ArrayList<CitaMedica> getcitasmedicas() {
        ArrayList<CitaMedica> listaCitasMedicas = new ArrayList<>();
        listaCitasMedicas.add(new CitaMedica("Dr Bobo", "23 de Diciembre del 2019", "Digestivo", "va acompañado,Julia Ramirez", "Ramon y Cajal", "Juan XXIII"));
        listaCitasMedicas.add(new CitaMedica("Dr Jimenez", "10 de Enero del 2020", "Oncologia", "va acompañado,Julia Ramirez", "Hospital Universitario de Mostoles", "C/ Rio Jucar S/N"));
        listaCitasMedicas.add(new CitaMedica("Dr Torreiglesias", "22 de Mayo del 2020", "Traumatologo", "sin acompañante", "Ramon y Cajal", "Juan XXIII"));
        return listaCitasMedicas;
    }
}