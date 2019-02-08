package com.example.tasfi.sd_assignment01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button LoginButton;
    private EditText nameEditText;
    private EditText idEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = (Button) findViewById(R.id.LoginButton);
        nameEditText = (EditText) findViewById(R.id.NameEditText);
        idEditText = (EditText) findViewById(R.id.IDEditText);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this,"Data Stored.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
