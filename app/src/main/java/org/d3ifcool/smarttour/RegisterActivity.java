package org.d3ifcool.smarttour;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    /**
     * This method is called when the register button is clicked
     */
    public void register(View view) {
        // Create user name, phone number, email and password
        EditText nama = (EditText) findViewById(R.id.nama_editText);
        EditText noTelp = (EditText) findViewById(R.id.hp_editText);
        EditText email = (EditText) findViewById(R.id.email_editText);
        EditText password = (EditText) findViewById(R.id.pass_editText);
        for (Account account : LoginActivity.accounts) {
            Log.d("email",account.getmEmail() );
            if (account.getmEmail().equals(email.getText().toString())) {
                Toast.makeText(this, "Email Telah Digunakan", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        LoginActivity.accounts.add(new Account(nama.getText().toString(),noTelp.getText().toString(),email.getText().toString(),password.getText().toString(),R.drawable.chanly));
        Toast.makeText(this,"Register Berhasil", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }

    //This method is called when the back button is clicked
    public void back(View view) {
        //To move to LoginActivity
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    //When the function of the button hasn't been made then the message appears
    public void noFunction(View view) {
        Toast.makeText(this, "Belum Bisa Digunakan", Toast.LENGTH_SHORT).show();
    }
}
