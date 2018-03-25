package org.d3ifcool.smarttour;

import java.util.ArrayList;

/**
 * Created by CHANLY on 3/10/2018.
 */

public class Account {
    private String mNama;
    private String mNoTelp;
    private String mEmail;
    private String mPassword;
    private int mFotoProfile;
    private ArrayList<Group> groups = new ArrayList<>();

    public Account(String mNama, String mNoTelp, String mEmail, String mPassword, int mFotoProfile) {
        this.mNama = mNama;
        this.mNoTelp = mNoTelp;
        this.mEmail = mEmail;
        this.mPassword = mPassword;
        this.mFotoProfile = mFotoProfile;
    }
    public Account(String mNama, String mNoTelp, String mEmail, String mPassword) {
        this.mNama = mNama;
        this.mNoTelp = mNoTelp;
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmNoTelp() {
        return mNoTelp;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public int getmFotoProfile() {
        return mFotoProfile;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmNoTelp(String mNoTelp) {
        this.mNoTelp = mNoTelp;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setmFotoProfile(int mFotoProfile) {
        this.mFotoProfile = mFotoProfile;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
    public void remGroup(Group group) {
        groups.remove(group);
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }
}
