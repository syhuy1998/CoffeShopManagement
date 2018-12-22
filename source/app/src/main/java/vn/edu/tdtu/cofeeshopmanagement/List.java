package vn.edu.tdtu.cofeeshopmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class List extends AppCompatActivity {
    Button btnCreate, btnfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btnCreate = findViewById(R.id.btnCreate);
        btnfinal = findViewById(R.id.btnFinal);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(List.this, "You make to create success!", Toast.LENGTH_SHORT).show();
            }
        });

        btnfinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List.this, Price.class);
                startActivity(intent);
            }
        });
    }
}
