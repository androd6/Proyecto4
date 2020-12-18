package com.ar6.proyecto4.data;

import com.ar6.proyecto4.R;

import java.util.ArrayList;

public class CreateMyPet {

    private ArrayList<Pet> varPets = new ArrayList<Pet>();

    public CreateMyPet() {

        try {

            varPets.add(new Pet("Pulgitas", 1, 1,R.drawable.pet6a, (byte) 1));
            varPets.add(new Pet("Pulgitas", 4, 1,R.drawable.pet6b, (byte) 2));
            varPets.add(new Pet("Pulgitas", 2, 1,R.drawable.pet6c, (byte) 3));
            varPets.add(new Pet("Pulgitas", 5, 1,R.drawable.pet6d, (byte) 4));
            varPets.add(new Pet("Turqueza", 6, 1,R.drawable.pet6e, (byte) 5));
            varPets.add(new Pet("Pulgitas", 7, 1,R.drawable.pet6f, (byte) 6));
            //varPets.add(new Pet("Pulgitas", 3, 1,R.drawable.pet6g, (byte) 7));
            //varPets.add(new Pet("Pulgitas", 8, 1,R.drawable.pet6h, (byte) 8));
        }
        catch (Exception ex){

        }

    }

    public ArrayList<Pet> getVarPets() {
        return varPets;
    }

    public void setVarPets(ArrayList<Pet> varPets) {
        this.varPets = varPets;
    }
}
