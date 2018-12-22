package vn.edu.tdtu.cofeeshopmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Price extends AppCompatActivity {

    Button btnBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        btnBill = findViewById(R.id.btnmakebill);

        btnBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Price.this, "Pay Success!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Price.this, Book.class);
                startActivity(intent);
            }
        });
    }
}
