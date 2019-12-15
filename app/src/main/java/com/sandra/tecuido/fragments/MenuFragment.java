package com.sandra.tecuido.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sandra.tecuido.activity.MainActivity;
import com.sandra.tecuido.R;
import com.sandra.tecuido.contract.RouterController;

public class MenuFragment extends Fragment {

    private RouterController routerController;

    public MenuFragment(MainActivity activity) {
        routerController = activity;
    }

    private TextView perfil;
    private TextView farmacia;
    private TextView citasMedicas;
    private TextView aseo;
    private TextView medicamentos;
    private TextView salir;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        perfil = view.findViewById(R.id.buttonProfile);
        farmacia = view.findViewById(R.id.buttonFarmacias);
        citasMedicas = view.findViewById(R.id.buttonCitasMedicas);
        aseo = view.findViewById(R.id.buttonAseo);
        medicamentos = view.findViewById(R.id.buttonMedicamentos);
        salir = view.findViewById(R.id.buttonSalir);

        initOnClick();
    }

    private void initOnClick() {
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routerController.routeToFragment(new ProfileFragment());
            }
        });
        farmacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routerController.routeToFragment(new FarmaciaFragment());
            }
        });
        citasMedicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routerController.routeToFragment(new CitasMedicasFragment());
            }
        });
        aseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routerController.routeToFragment(new AseoFragment());
            }
        });
        medicamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routerController.routeToFragment(new MedicamentosFragment());
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                routerController.exit();
            }
        });
    }
}
