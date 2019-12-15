package com.sandra.tecuido.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sandra.tecuido.R;
import com.sandra.tecuido.activity.AddInfoActivity;
import com.sandra.tecuido.adapter.MedicamentosAdapter;
import com.sandra.tecuido.data.Medicamento;

import java.util.ArrayList;

public class MedicamentosFragment extends Fragment {

    private FloatingActionButton buttonAñadirMedicacion;
    private RecyclerView recyclerView;
    private MedicamentosAdapter medicamentosAdapter = new MedicamentosAdapter(getMedicamentoList());

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.medicacion_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonAñadirMedicacion = view.findViewById(R.id.buttonAñadirMedicacion);
        recyclerView = view.findViewById(R.id.listaMedicamentos);
        initOnClick();

    }

    private void initOnClick() {
        buttonAñadirMedicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddInfoActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(medicamentosAdapter);
    }

    private ArrayList<Medicamento>getMedicamentoList(){
        ArrayList<Medicamento>listaMedicamento = new ArrayList<>();
        //listaMedicamento.add(new Medicamento(""));



        return  listaMedicamento;
    }
}

