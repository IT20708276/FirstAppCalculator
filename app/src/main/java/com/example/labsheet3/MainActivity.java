package com.example.labsheet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText enter_birth_year;
    private Button calcage;
    private TexttView ageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //bind the programming variables with views in the layout xml
        enter_birth_year = findViewById(R.id.etyear);
        calcage= findViewById(R.id.btnCalculator);
        ageview = findViewById(R.id.dbage);

        calcage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer inyear = Integer.parseInt(enter_birth_year.getText().toString());
                Integer curyear = Calendar.getInstance().get(Calendar.YEAR);
                Integer age= (curyear - inyear);

                ageview.setText("You are "+age+"years");
            }
        });
    }
}
