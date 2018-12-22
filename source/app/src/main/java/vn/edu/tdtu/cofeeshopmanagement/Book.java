package vn.edu.tdtu.cofeeshopmanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * *@author T.T.Vy
 * DesCription.
 * this class use to start Book activity
 */

public class Book extends AppCompatActivity implements View.OnClickListener {
    Button buttonBook;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        buttonBook = findViewById(R.id.btnBook);//find button by id
        buttonBook.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        Toast.makeText(Book.this, "Book susscessly!!", Toast.LENGTH_SHORT).show();// show test on the screen
    }
}
