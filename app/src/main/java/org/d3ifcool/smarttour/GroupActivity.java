package org.d3ifcool.smarttour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GroupActivity extends AppCompatActivity {
    static Account loggedAccount = null;
    static ListGroup group =  new ListGroup();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        //Get user name and phone number from Account
        TextView nama = (TextView) findViewById(R.id.nama_textView) ;
        TextView noHP = (TextView) findViewById(R.id.hp_textView) ;
        final ListView listView = (ListView) findViewById(R.id.group_listView);

        listView.setItemsCanFocus(true);
        nama.setText(loggedAccount.getmNama());
        noHP.setText(loggedAccount.getmNoTelp());

        GroupAdapter adapter = new GroupAdapter(this,group.getGroupList());
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);



    }

    public void toCreateGroup(View view){
        //To move to CreateGroupActivity
        Intent intent = new Intent(GroupActivity.this,CreateGroupActivity.class);
        startActivity(intent);
    }
}