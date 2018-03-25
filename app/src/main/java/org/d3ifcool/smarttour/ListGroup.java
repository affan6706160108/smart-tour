package org.d3ifcool.smarttour;

import java.util.ArrayList;

/**
 * Created by CHANLY on 3/15/2018.
 */

public class ListGroup {
    private ArrayList<Group> groupList = new ArrayList<>();

    public ListGroup() {
        groupList.add(new Group("Study Ancol", "Jakarta","123", R.drawable.ancol2));
        groupList.add(new Group("Study Ragunan", "Jakarta Selatan","123",R.drawable.ragunan));
        groupList.add(new Group("Study Yogyakarta", "Yogyakarta","123",R.drawable.yogyakarta));

        groupList.get(0).getAnggota().add((new Account("Chanly", "08237263","chanly@gmail.com","123")));
        groupList.get(0).getAnggota().add((new Account("Affan", "098237","chanly@gmail.com","123")));
        groupList.get(1).getAnggota().add((new Account("Ferdy", "2094772","chanly@gmail.com","123")));
        groupList.get(1).getAnggota().add((new Account("Septian", "092372","chanly@gmail.com","123")));
        groupList.get(2).getAnggota().add((new Account("Alviansyah", "0928373","chanly@gmail.com","123")));
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }
}
