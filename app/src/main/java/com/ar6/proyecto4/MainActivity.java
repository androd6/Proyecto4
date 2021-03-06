package com.ar6.proyecto4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.ar6.proyecto4.adapters.Petadapter;
import com.ar6.proyecto4.adapters.V1ViewPageAdapter;
import com.ar6.proyecto4.data.CreatePet;
import com.ar6.proyecto4.data.Pet;
import com.ar6.proyecto4.fragments.PetDetFragment;
import com.ar6.proyecto4.fragments.PetFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pet> varPetsList = new ArrayList<>();
    private CreatePet varPetsIni = new CreatePet();
    private V1ViewPageAdapter varViewPagerAdapter;
    private ViewPager2 varViewPager;
    private TabLayout varTabLayout;

    public static final ArrayList<Pet> paramPetsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definicion del toolbar del activity
        Toolbar varToolbar = findViewById(R.id.v1_ToolBar);
        setSupportActionBar(varToolbar);

        varPetsList = varPetsIni.getVarPets();

        varViewPager = findViewById(R.id.v1_ViewPager);
        varViewPagerAdapter = new V1ViewPageAdapter(getSupportFragmentManager(),getLifecycle());
        varViewPagerAdapter.addFragment(new PetFragment());
        varViewPagerAdapter.addFragment(new PetDetFragment());
        varViewPager.setAdapter(varViewPagerAdapter);

        varTabLayout = findViewById(R.id.v1_TabBar);
        new TabLayoutMediator(varTabLayout, varViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText(R.string.v1_Tab1);
                        break;
                    case 1:
                        tab.setText(R.string.v1_Tab2);
                        break;
                }
            }
        }).attach();
    }

    public void onClickImgBtn(View v){
        paramPetsList.add(varPetsList.get(1));
        paramPetsList.add(varPetsList.get(2));
        paramPetsList.add(varPetsList.get(3));
        paramPetsList.add(varPetsList.get(6));
        paramPetsList.add(varPetsList.get(7));

        Intent varIntent = new Intent(this, FavoritosActivity.class);
        varIntent.putParcelableArrayListExtra("Lista", paramPetsList);
        startActivity(varIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opt_mainact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent varIntent;

        switch (item.getItemId()){
            case R.id.mnoptmaitem2:
                varIntent = new Intent(this, AboutActivity.class);
                startActivity(varIntent);
                break;
            case R.id.mnoptmaitem1:
                varIntent = new Intent(this, EmailActivity.class);
                startActivity(varIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}