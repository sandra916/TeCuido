package com.sandra.tecuido.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.sandra.tecuido.R;
import com.sandra.tecuido.contract.RouterController;
import com.sandra.tecuido.contract.ToolbarController;
import com.sandra.tecuido.fragments.CitasMedicasFragment;
import com.sandra.tecuido.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity implements RouterController, ToolbarController {

    private DrawerLayout drawerLayout;
    private FrameLayout frameLayout;
    private TextView toolbarTitle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
        drawerLayout = findViewById(R.id.drawer_layout);
        frameLayout = findViewById(R.id.menu_container);
        toolbarTitle = findViewById(R.id.toolbar_title);
        toolbar = findViewById(R.id.toolbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.menu_container, new MenuFragment(this)).commit();
        routeToFragment(new CitasMedicasFragment());

        initToolbar();
    }

    private void initToolbar() {
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(frameLayout);
            }
        });
    }

    @Override
    public void routeToFragment(Fragment fragment) {
        drawerLayout.closeDrawer(frameLayout);
        getSupportFragmentManager().beginTransaction().replace(R.id.base_layout, fragment).commit();
    }

    @Override
    public void exit() {
        finish();
    }

    @Override
    public void setTitle(String title) {
        toolbarTitle.setText(title);
    }
}
