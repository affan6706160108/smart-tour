package org.d3ifcool.smarttour;

import android.content.Context;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class FriendsAdapter extends ArrayAdapter<Account> {

    public FriendsAdapter(@NonNull Context context, @NonNull ArrayList<Account> objects) {
        super(context, 0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_friends,parent,false);
        }
        final Account currentFriend = getItem(position);

        TextView name = (TextView)convertView.findViewById(R.id.nama_textView);
        name.setText(currentFriend.getmNama());

        TextView contact = (TextView)convertView.findViewById(R.id.kontak_textView);
        contact.setText(currentFriend.getmNoTelp());

        ImageView photo = (ImageView) convertView.findViewById(R.id.foto_imgView);
        photo.setImageResource(currentFriend.getmFotoProfile());

        Button button_Maps = (Button) convertView.findViewById(R.id.button_maps) ;
        Button button_Chat = (Button) convertView.findViewById(R.id.button_chat);
        button_Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),GroupMaps.class);
                getContext().startActivity(intent);
            }
        });

        //When the function of the button hasn't been made then the message appears
        button_Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Belum Bisa Digunakan", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;

    }
}