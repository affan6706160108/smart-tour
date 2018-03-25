package org.d3ifcool.smarttour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FriendsGroupActivity extends AppCompatActivity {

    static Group currentGroup = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendsgroup);

        ImageView imageView = (ImageView) findViewById(R.id.foto_imgView) ;
        TextView name = (TextView) findViewById(R.id.nama_textView);
        TextView lokasi = (TextView) findViewById(R.id.lokasi_textView);

        ListView listView = (ListView) findViewById(R.id.group_listView);

        if(currentGroup.getmFoto() != -1) {
            imageView.setImageResource(currentGroup.getmFoto());
        }
        name.setText(currentGroup.getmNama());
        lokasi.setText(currentGroup.getmLokasi());
        boolean isMember = false;
        for(Account account : currentGroup.getAnggota()) {
            if (account == GroupActivity.loggedAccount) {
                isMember = true;
            }

        }
        if (isMember == false) {
            currentGroup.getAnggota().add(GroupActivity.loggedAccount);
        }

        FriendsAdapter adapter = new FriendsAdapter(this,currentGroup.getAnggota());
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void toMaps(View view) {
        //To move to class GroupMaps
        Intent intent = new Intent(this,GroupMaps.class);
        startActivity(intent);
    }

    //When the function of the button hasn't been made then the message appears
    public void noFunction(View view) {
        Toast.makeText(this, "Belum Bisa Digunakan", Toast.LENGTH_SHORT).show();
    }
}
