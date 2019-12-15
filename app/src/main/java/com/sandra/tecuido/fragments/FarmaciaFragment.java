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
import com.sandra.tecuido.adapter.FarmaciaAdapter;
import com.sandra.tecuido.data.Farmacia;

import java.util.ArrayList;

public class FarmaciaFragment extends Fragment {

    private RecyclerView recyclerView;
    private FarmaciaAdapter farmaciaAdapter = new FarmaciaAdapter(getPharmacyList());

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.farmacia_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.listaFarmacias);
        initRecycler();
    }

    private void initRecycler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(farmaciaAdapter);
    }

    private ArrayList<Farmacia> getPharmacyList() {
        ArrayList<Farmacia> listaFarmacia = new ArrayList<>();
        listaFarmacia.add(new Farmacia("Trebol Doctor Castelo", "c/Castelo 26", "9:30 a 23:00", "915731163"));
        listaFarmacia.add(new Farmacia("Lavapies", "c/Lavapies ,56", "9:30 a 21:30", "916272430"));
        listaFarmacia.add(new Farmacia("Hermanos Pizon", "c/Hermanos Pinzon,2", "Abierto 24 horas", "911721874"));
        listaFarmacia.add(new Farmacia("Reche Europa", "c/Haya,8", "9:30 a 21:30", "911745300"));
        return listaFarmacia;
    }
}
