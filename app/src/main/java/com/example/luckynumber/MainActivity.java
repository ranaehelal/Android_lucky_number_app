package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button getLuckyNumberButton ;
    EditText nameEditText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize your views here after setContentView
        getLuckyNumberButton = findViewById(R.id.get_lucky_number);
        nameEditText = findViewById(R.id.editTextText);


        getLuckyNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int luckyNumber = new Random().nextInt(1000) + 1;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

               intent.putExtra("LUCKY_NUMBER", luckyNumber);
               intent.putExtra("NAME", nameEditText.getText().toString());
                startActivity(intent);

            }
        });
    }
}
