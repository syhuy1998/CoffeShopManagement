package vn.edu.tdtu.cofeeshopmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * *@author T.T.Vy
 * DesCription.
 * this class is main activity will be call while programs open
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edittextUsername;
    EditText edittextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittextUsername = findViewById(R.id.edtusername);//find edit text by id
        edittextPassword = findViewById(R.id.edtpassword);//find edit text by id
        buttonLogin = findViewById(R.id.btnLogin);//button by id
        buttonLogin.setOnClickListener(this);//set click
    }

    @Override
    public void onClick(final View v) {
        // compare with real ID Password
        if (edittextPassword.getText().toString().equals("admin")
                && edittextUsername.getText().toString().equals("admin")) {
            Toast.makeText(MainActivity.this, "Login success!", Toast.LENGTH_SHORT).show();//show message
            // jump to Order activity
            Intent intent = new Intent(MainActivity.this , Order.class);
            startActivity(intent);
        } else {
            // show message wrong id or password
            Toast.makeText(MainActivity.this, "Please check your username or password", Toast.LENGTH_SHORT).show();
        }
    }
}
