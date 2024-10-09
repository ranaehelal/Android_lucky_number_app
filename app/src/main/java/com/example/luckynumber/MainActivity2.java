package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button shareWithFriendsButton  ;
    TextView luckyNumberTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        shareWithFriendsButton = findViewById(R.id.share_with_friends);
        luckyNumberTextView = findViewById(R.id.lucky_number_text);


        // Retrieve the name and lucky number from the Intent
        int luckyNumber = getIntent().getIntExtra("LUCKY_NUMBER", 0);
        String name = getIntent().getStringExtra("NAME");


        // Set an OnClickListener for the Share Button
        luckyNumberTextView.setText(String.valueOf(luckyNumber));
        shareWithFriendsButton.setOnClickListener(
                (view) -> {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String shareMessage = name + "'s lucky number is " + luckyNumber + "!";
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Lucky Number");
                    intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(shareMessage));
                    startActivity(intent);
                }
        );
    }
}
