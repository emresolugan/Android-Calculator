package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_sayi1;
    EditText et_sayi2;
    EditText et_sonuc;
    Button topla;
    Button cikar;
    Button carp;
    Button bol;

    double sayi1=0;
    double sayi2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_sayi1 = (EditText) findViewById(R.id.et_Sayi1);
        et_sayi2 = (EditText) findViewById(R.id.et_Sayi2);
        et_sonuc = (EditText) findViewById(R.id.et_sonuc);
        topla = (Button) findViewById(R.id.btn_topla);
        cikar = (Button) findViewById(R.id.btn_cikar);
        carp = (Button) findViewById(R.id.btn_carp);
        bol = (Button) findViewById(R.id.btn_bol);
    }


    public void btnToplaClick(View view) {
        sayi1 = Double.parseDouble(String.valueOf(et_sayi1.getText()));
        sayi2 = Double.parseDouble(String.valueOf(et_sayi2.getText()));

        et_sonuc.setText(String.valueOf(sayi1+sayi2));
    }

    public void btnCikarClick(View view) {
        sayi1 = Double.parseDouble(String.valueOf(et_sayi1.getText()));
        sayi2 = Double.parseDouble(String.valueOf(et_sayi2.getText()));

        et_sonuc.setText(String.valueOf(sayi1-sayi2));
    }

    public void btnCarpClick(View view) {
        sayi1 = Double.parseDouble(String.valueOf(et_sayi1.getText()));
        sayi2 = Double.parseDouble(String.valueOf(et_sayi2.getText()));

        et_sonuc.setText(String.valueOf(sayi1*sayi2));
    }

    public void btnBolClick(View view) {
        sayi1 = Double.parseDouble(String.valueOf(et_sayi1.getText()));
        sayi2 = Double.parseDouble(String.valueOf(et_sayi2.getText()));

        et_sonuc.setText(String.valueOf(sayi1/sayi2));
    }
}
