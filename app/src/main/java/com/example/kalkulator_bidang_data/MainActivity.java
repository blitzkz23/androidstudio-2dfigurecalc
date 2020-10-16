package com.example.kalkulator_bidang_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPAD, txtLT;
    TextView hslKeliling, hslLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPAD = (EditText) findViewById(R.id.txtPAD);
        txtLT = (EditText) findViewById(R.id.txtLT);
        hslKeliling = (TextView) findViewById(R.id.hslKeliling);
        hslLuas = (TextView) findViewById(R.id.hslLuas);
    }

    public void doSomething(View view) {
        double num1 = Double.parseDouble(txtPAD.getText().toString());
        double num2 = Double.parseDouble(txtLT.getText().toString());
        double phi = 3.14;
        double r = num1 / 2;
        double luas,keliling;

        switch (view.getId()) {
            case R.id.button1:
                if(txtPAD.getText().toString().isEmpty() || txtLT.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Silahkan lengkapi angka pada kedua isian yang tersedia~",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    luas = (num1*num2)/2;
                    keliling = (2*num1)+(2*num2);
                    hslLuas.setText(Double.toString(luas));
                    hslKeliling.setText(Double.toString(keliling));

                }
                break;

            case R.id.button2:
                if(txtPAD.getText().toString().isEmpty() || txtLT.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Silahkan lengkapi angka pada kedua isian yang tersedia~",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    luas = (num1*num2)/2;
                    keliling = 3*num1;
                    hslLuas.setText(Double.toString(luas));
                    hslKeliling.setText(Double.toString(keliling));
                }

                break;

            case R.id.button3:
                if(txtPAD.getText().toString().isEmpty() || txtLT.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Silahkan lengkapi angka pada kedua isian yang tersedia~",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    luas = phi*r*r;
                    keliling = 2*phi*num1;
                    hslLuas.setText(Double.toString(luas));
                    hslKeliling.setText(Double.toString(keliling));
                }
                break;
        }
    }
}