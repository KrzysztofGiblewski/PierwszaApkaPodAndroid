package com.example.oktan.pierwszawandroidzie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private TextView textViewHello;
    private EditText editTextPierwsza;
    private EditText editTextDruga;
    private TextView przepisanaPierwsza;
    private TextView przepisanaDruga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupViews();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dodawanie dodawanie = new Dodawanie();

                editTextPierwsza = (EditText) findViewById(R.id.editTextPierwsza);
                editTextDruga = (EditText) findViewById(R.id.editTextDruga);
                int pierwsza = Integer.valueOf(String.valueOf(editTextPierwsza.getText()));
                int druga = Integer.valueOf(String.valueOf(editTextDruga.getText()));


//                int wynikDodawania = dodawanie.wynik(editTextPierwsza,editTextDruga);
                int wynikDodawania = dodawanie.wynik(pierwsza, druga);

                textViewHello.setText(pierwsza + " + " + druga + " = " + wynikDodawania);
                przepisanaPierwsza.setText(String.valueOf(pierwsza));
                przepisanaDruga.setText(String.valueOf(druga));

            }
        });
    }

    public void setupViews() {
        button1 = (Button) findViewById(R.id.button1);
        textViewHello = (TextView) findViewById(R.id.textViewHello);
        editTextPierwsza = (EditText) findViewById(R.id.editTextPierwsza);
        editTextDruga = (EditText) findViewById(R.id.editTextDruga);
        przepisanaPierwsza = (TextView) findViewById(R.id.przepisanaPierwsza);
        przepisanaDruga = (TextView) findViewById(R.id.przepisanaDruga);


    }

}
