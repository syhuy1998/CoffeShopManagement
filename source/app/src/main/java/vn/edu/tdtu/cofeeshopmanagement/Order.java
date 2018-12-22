package vn.edu.tdtu.cofeeshopmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        btnOrder = findViewById(R.id.button4);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Order.this, "Order successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Order.this, List.class);
                startActivity(intent);
            }
        });
    }
}
