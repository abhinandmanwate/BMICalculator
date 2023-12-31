package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight, edtHightFt,edtHightIn;
        Button btnCalculate;
        TextView txtResult;

        edtWeight =findViewById(R.id.edtWeight);
        edtHightFt = findViewById(R.id.edtHightFt);
        edtHightIn = findViewById(R.id.edtHightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHightFt.getText().toString());
                int in = Integer.parseInt(edtHightIn.getText().toString());


                int totalIn = ft*12 + in;

                double totalCm = totalIn*2.54;

                double totalM = totalCm/100;

                double bmi = wt/(totalM*totalM);

                if(bmi>25){

                    txtResult.setText("You're overweight!");
                }else if(bmi<18) {
                    txtResult.setText("You're under weight!");
                }
                else{

                    txtResult.setText("You're Healthy");
                }


            }
        });


    }
}