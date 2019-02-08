package com.example.tasfi.sd_assignment01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    private Button nextButton;
    private TextView DateTextView;
    private DatePicker datePicker;
    private Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nextButton = (Button) findViewById(R.id.next1Button);
        selectButton = (Button) findViewById(R.id.DateButton);
        DateTextView = (TextView) findViewById(R.id.DateTextView);
        datePicker = (DatePicker) findViewById(R.id.DatePicker);

        DateTextView.setText(currentDate());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateTextView.setText(currentDate());
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                finish();

            }
        });
    }
    String currentDate()
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("DATE:");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getDayOfMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();

    }
}
