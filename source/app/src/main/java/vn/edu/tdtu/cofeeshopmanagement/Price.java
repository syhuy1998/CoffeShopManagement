package vn.edu.tdtu.cofeeshopmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * *@author T.T.Vy
 * DesCription.
 * this class use to start Price activity
 */

public class Price extends AppCompatActivity {

    Button buttonBill;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        buttonBill = findViewById(R.id.btnmakebill);// find button by id

        buttonBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Toast.makeText(Price.this, "Pay Success!", Toast.LENGTH_SHORT).show();//show message on the screen
                //start book activity
                Intent intent = new Intent(Price.this, Book.class);
                startActivity(intent);
            }
        });
    }
}
