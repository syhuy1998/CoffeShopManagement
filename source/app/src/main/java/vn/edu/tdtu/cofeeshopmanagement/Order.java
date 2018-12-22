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
 * this class use to start Order activity
 */

public class Order extends AppCompatActivity {

    Button buttonOrder;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        buttonOrder = findViewById(R.id.button4);//find button by id
        //set click
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Toast.makeText(Order.this, "Order successfully!", Toast.LENGTH_SHORT).show();//show message
                //jump to List activity
                Intent intent = new Intent(Order.this, List.class);
                startActivity(intent);
            }
        });
    }
}
