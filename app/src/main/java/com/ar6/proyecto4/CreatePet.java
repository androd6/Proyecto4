package com.ar6.proyecto4;

import java.util.ArrayList;

public class CreatePet {

    private ArrayList<Pet> varPets = new ArrayList<Pet>();

    public CreatePet() {

        try {

            varPets.add(new Pet("Lukas", 0, 1,R.drawable.pet1, (byte) 1));
            varPets.add(new Pet("Matias", 0, 3,R.drawable.pet3, (byte) 2));
            varPets.add(new Pet("Candy", 0, 1,R.drawable.pet2, (byte) 3));
            varPets.add(new Pet("Trosky", 0, 4,R.drawable.pet5, (byte) 4));
            varPets.add(new Pet("Turqueza", 0, 4,R.drawable.pet7, (byte) 5));
            varPets.add(new Pet("Spok", 0, 1,R.drawable.pet8, (byte) 6));
            varPets.add(new Pet("sakura", 0, 2,R.drawable.pet9, (byte) 7));
            varPets.add(new Pet("Pulgitas", 0, 1,R.drawable.pet6, (byte) 8));
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
