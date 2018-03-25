package org.d3ifcool.smarttour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    static ArrayList<Account> accounts = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    /**
     * This method is called when the login button is clicked
     */
    public void login(View view) {
        // get user email and password
        EditText email = (EditText) findViewById(R.id.email_editText);
        EditText pass = (EditText) findViewById(R.id.pass_editText);
        if (accounts != null) {
            for (Account account : accounts) {
                if (account.getmEmail().equals(email.getText().toString())) {
                    if (account.getmPassword().equals( pass.getText().toString())) {
                        GroupActivity.loggedAccount = account;
                        Log.d("Status", "Logged in");
                        Intent logged = new Intent(this, GroupActivity.class);
                        Toast.makeText(this, "Selamat datang", Toast.LENGTH_SHORT).show();
                        startActivity(logged);
                        return;

                    } else {
                        Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
            }

        }
        Toast.makeText(this, "Email atau Password salah", Toast.LENGTH_SHORT).show();



    }

    public void register(View view) {
        //To move to register activity
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
