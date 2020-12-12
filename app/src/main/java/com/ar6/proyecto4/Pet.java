package com.ar6.proyecto4;

import android.os.Parcel;
import android.os.Parcelable;

public class Pet implements Parcelable{

    public static final Parcelable.Creator<Pet> CREATOR = new Parcelable.Creator<Pet>() {
        public Pet createFromParcel(Parcel in) {
            return new Pet(in);
        }

        public Pet[] newArray(int size) {
            return new Pet[size];
        }
    };

    private String varNombre;
    private int varRanking;
    private int varEdad;
    private int varFoto;
    private byte varID;

    public Pet() {
    }

    public Pet(String varNombre, int varRanking, int varEdad, int varFoto, byte varID) {
        this.varNombre = varNombre;
        this.varRanking = varRanking;
        this.varEdad = varEdad;
        this.varFoto = varFoto;
        this.varID = varID;
    }

    public Pet(Parcel in) {
        this.varNombre = in.readString();
        this.varRanking = in.readInt();
        this.varEdad = in.readInt();
        this.varFoto = in.readInt();
        this.varID = in.readByte();
    }

    public String getVarNombre() {
        return varNombre;
    }

    public void setVarNombre(String varNombre) {
        this.varNombre = varNombre;
    }

    public int getVarRanking() {
        return varRanking;
    }

    public void setVarRanking(int varRanking) {
        this.varRanking = varRanking;
    }

    public int getVarEdad() {
        return varEdad;
    }

    public void setVarEdad(int varEdad) {
        this.varEdad = varEdad;
    }

    public int getVarFoto() {
        return varFoto;
    }

    public void setVarFoto(int varFoto) {
        this.varFoto = varFoto;
    }

    public byte getVarID() {
        return varID;
    }

    public void setVarID(byte varID) {
        this.varID = varID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.varNombre);
        dest.writeInt(this.varRanking);
        dest.writeInt(this.varEdad);
        dest.writeInt(this.varFoto);
        dest.writeByte(this.varID);
    }

}
