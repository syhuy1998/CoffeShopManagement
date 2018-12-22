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
 * this class use to start List activity
 */

public class List extends AppCompatActivity implements View.OnClickListener {
    Button buttonCreate;
    Button buttonFinal;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        buttonCreate = findViewById(R.id.btnCreate);//find button by id
        buttonFinal = findViewById(R.id.btnFinal);//find button by id

        buttonFinal.setOnClickListener(this);//set click
        buttonCreate.setOnClickListener(this);//set click
    }

    @Override
    public void onClick(final View v) {
        //perfrom which button
        switch (v.getId())
        {
            case R.id.btnCreate ://buttonCreate be clicked
                Toast.makeText(List.this, "You make to create success!", Toast.LENGTH_SHORT).show();//show message on the screen
                break;
            case R.id.btnFinal://buttonFinal be clicked
                // jump to Price activity
                Intent intent = new Intent(List.this, Price.class);
                startActivity(intent);
                break;
            default:

        }

    }
}