package com.ar6.proyecto4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ar6.proyecto4.R;
import com.ar6.proyecto4.adapters.Petadapter;
import com.ar6.proyecto4.data.CreateMyPet;
import com.ar6.proyecto4.data.CreatePet;
import com.ar6.proyecto4.data.Pet;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PetDetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PetDetFragment extends Fragment {

    private ArrayList<Pet> varPetsList = new ArrayList<>();
    private CreateMyPet varPetsIni = new CreateMyPet();
    private RecyclerView varRvListPet;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PetDetFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PetDetFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PetDetFragment newInstance(String param1, String param2) {
        PetDetFragment fragment = new PetDetFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View varView;
        // Inflate the layout for this fragment
        varPetsList = varPetsIni.getVarPets();

        varView = inflater.inflate(R.layout.fragment_pet_det, container, false);
        varRvListPet = varView.findViewById(R.id.v1_FrgRecycledView2);

        GridLayoutManager varLLM = new GridLayoutManager(getActivity(), 2);
        varLLM.setOrientation(LinearLayoutManager.VERTICAL);

        varRvListPet.setLayoutManager(varLLM);

        iniAdaptador();

        return varView;

    }

    public void iniAdaptador () {
        Petadapter varAdapterPet = new Petadapter(varPetsList);
        varRvListPet.setAdapter(varAdapterPet);
    }
}