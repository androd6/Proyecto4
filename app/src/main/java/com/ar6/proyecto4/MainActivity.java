package com.ar6.proyecto4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pet> varPetsList = new ArrayList<>();
    private CreatePet varPetsIni = new CreatePet();
    private RecyclerView varRvListPet;

    public static final ArrayList<Pet> paramPetsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definicion del toolbar del activity
        Toolbar varToolbar = findViewById(R.id.v1_ToolBar);
        setSupportActionBar(varToolbar);

        varPetsList = varPetsIni.getVarPets();

        varRvListPet = findViewById(R.id.v1_RecycledView);

        LinearLayoutManager varLLM = new LinearLayoutManager(this);
        varLLM.setOrientation(LinearLayoutManager.VERTICAL);

        varRvListPet.setLayoutManager(varLLM);

        iniAdaptador();

    }

    public void iniAdaptador () {
        Petadapter varAdapterPet = new Petadapter(varPetsList);
        varRvListPet.setAdapter(varAdapterPet);
    }

    public void onClickImgBtn(View v){
        paramPetsList.add(varPetsList.get(1));
        paramPetsList.add(varPetsList.get(2));
        paramPetsList.add(varPetsList.get(3));
        paramPetsList.add(varPetsList.get(6));
        paramPetsList.add(varPetsList.get(7));

        //Intent varIntent = new Intent(this, Favoritos.class);
        //varIntent.putParcelableArrayListExtra("Lista", paramPetsList);
        //startActivity(varIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opt_mainact, menu);
        return true;
    }
}