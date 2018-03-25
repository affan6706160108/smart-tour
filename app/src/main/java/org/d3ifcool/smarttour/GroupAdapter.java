package org.d3ifcool.smarttour;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GroupAdapter extends ArrayAdapter<Group> {

    GroupAdapter(@NonNull Context context, @NonNull ArrayList<Group> objects) {
        super(context, 0, objects);
    }

    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_group,parent,false);
        }
        final Group currentGroup = getItem(position);

        TextView nama = (TextView)convertView.findViewById(R.id.nama_textView);
        nama.setText(currentGroup.getmNama());

        TextView lokasi = (TextView)convertView.findViewById(R.id.lokasi_textView);
        lokasi.setText(currentGroup.getmLokasi());

        final EditText pass = (EditText)convertView.findViewById(R.id.pass_editText);

        Button button = (Button)convertView.findViewById(R.id.passBtn_Btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pass.getText().toString().equals(currentGroup.getmPass())){
                    FriendsGroupActivity.currentGroup = currentGroup;
                    Intent intent = new Intent(getContext(),FriendsGroupActivity.class);
                    getContext().startActivity(intent);

                } else {
                    Toast.makeText(getContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        if (currentGroup.getmFoto() != -1) {
            ImageView foto = (ImageView) convertView.findViewById(R.id.foto_imgView);
            foto.setImageResource(currentGroup.getmFoto());
        }

        return convertView;
    }
}