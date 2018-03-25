package org.d3ifcool.smarttour;


import java.util.ArrayList;

public class Group {
    private String mNama = "";
    private String mLokasi = "";
    private String mPass = "";
    private int mFoto = -1;
    private ArrayList<Account> anggota = new ArrayList<>();

    public Group(String mNama, String mLokasi, String mPass, int mFoto) {
        this.mNama = mNama;
        this.mLokasi = mLokasi;
        this.mPass = mPass;
        this.mFoto = mFoto;
    }

    public Group(String mNama, String mLokasi, String mPass) {
        this.mNama = mNama;
        this.mLokasi = mLokasi;
        this.mPass = mPass;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmLokasi() {
        return mLokasi;
    }

    public String getmPass() {
        return mPass;
    }

    public int getmFoto() {
        return mFoto;
    }

    public ArrayList<Account> getAnggota() {
        return anggota;
    }
}
