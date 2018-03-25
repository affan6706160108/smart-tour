package org.d3ifcool.smarttour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class CreateGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);

    }

    /**
     * This method is called when the create group button is clicked
     */
    public void createGroup(View view) {
        //Create group's name, location, and password
        EditText nama = (EditText) findViewById(R.id.nama_editText);
        EditText lokasi = (EditText) findViewById(R.id.lokasi_editText);
        EditText password = (EditText) findViewById(R.id.pass_editText);

        //Add a new group to array list grup from class GroupActivity
        GroupActivity.group.getGroupList().add (new Group(nama.getText().toString(),lokasi.getText().toString(),password.getText().toString(),R.drawable.ancol2));
        Toast.makeText(this,"Buat grup berhasil", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(CreateGroupActivity.this,GroupActivity.class);
        startActivity(intent);
    }

    public void toGroup(View view){
        //To move to GroupActivity
        Intent intent = new Intent(CreateGroupActivity.this,GroupActivity.class);
        startActivity(intent);
    }

    //When the function of the button hasn't been made then the message appears
    public void noFunction(View view) {
        Toast.makeText(this, "Belum Bisa Digunakan", Toast.LENGTH_SHORT).show();
    }
}
