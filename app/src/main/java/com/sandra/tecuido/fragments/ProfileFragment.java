package com.sandra.tecuido.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.tecuido.R;
import com.sandra.tecuido.adapter.CurasAdapter;
import com.sandra.tecuido.adapter.EnfermedadesAdapter;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {
    private RecyclerView recyclerViewEnfermedades, recyclerViewCuras;
    private TextView enfermedadesTitle, curastitle;
    private EnfermedadesAdapter enfermedadesAdapter = new EnfermedadesAdapter(getListaEnfermedades());
    private CurasAdapter curasAdapter = new CurasAdapter(getListaCuras());


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.profile_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewEnfermedades = view.findViewById(R.id.listEnfermedades);
        recyclerViewCuras = view.findViewById(R.id.listaCuras);
        enfermedadesTitle = view.findViewById(R.id.tituloEnfermedades);
        curastitle = view.findViewById(R.id.tituloCuras);
        initRecyclerView();
        initOnClick();
    }

    private void initRecyclerView() {
        recyclerViewEnfermedades.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerViewEnfermedades.setHasFixedSize(true);
        recyclerViewEnfermedades.setAdapter(enfermedadesAdapter);
        recyclerViewCuras.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerViewCuras.setHasFixedSize(true);
        recyclerViewCuras.setAdapter(curasAdapter);

    }

    private void initOnClick() {
        enfermedadesTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (recyclerViewEnfermedades.getVisibility() == View.GONE) {
                    enfermedadesTitle.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_flecha_arriba, 0);
                    recyclerViewEnfermedades.setVisibility(View.VISIBLE);
                } else {
                    enfermedadesTitle.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_flecha_abajo, 0);
                    recyclerViewEnfermedades.setVisibility(View.GONE);
                }
            }
        });

        curastitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (recyclerViewCuras.getVisibility() == View.GONE) {
                    curastitle.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_flecha_arriba, 0);
                    recyclerViewCuras.setVisibility(View.VISIBLE);
                } else {
                    curastitle.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_flecha_abajo, 0);
                    recyclerViewCuras.setVisibility(View.GONE);
                }
            }
        });
    }

    private ArrayList<String> getListaEnfermedades() {
        ArrayList<String> listaEnfermedades = new ArrayList<>();
        listaEnfermedades.add("Diabetico");
        listaEnfermedades.add("Cancer pancreas");
        listaEnfermedades.add("Tiroides");
        listaEnfermedades.add("Hernia Discal");
        return listaEnfermedades;
    }

    private ArrayList<String> getListaCuras() {
        ArrayList<String> listaCuras = new ArrayList<>();
        listaCuras.add("Las curas son en el hogar");
        listaCuras.add("Necesito Suero Fisologico,Gasas Esteriles,Guantes esterilizados,Apositos de 10*10, Pomada Antibiotica");
        listaCuras.add("Las curas son 5 veces al dia");
        listaCuras.add("Cartuchos para la pluma de Insulina");
        return listaCuras;
    }
}
