package com.example.oktan.pierwszawandroidzie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button buttonMnozenie;
    private TextView textViewHello;
    private EditText editTextPierwsza;
    private EditText editTextDruga;
    private TextView przepisanaPierwsza; //na razie nie urzywane tylko do kontroli
    private TextView przepisanaDruga;  //na razie nie urzywane tylko do kontroli


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        editTextPierwsza = (EditText) findViewById(R.id.editTextPierwsza);  //łącze edittextpierwszy po id z edittekstpierwszy
        editTextDruga = (EditText) findViewById(R.id.editTextDruga);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dodawanie dodawanie = new Dodawanie(); //inicjalizuje klase dodawanie

                int pierwsza = Integer.valueOf(String.valueOf(editTextPierwsza.getText()));  // twoze zmienna pierwsza i przepisuje wartość edittextpierwszy
                int druga = Integer.valueOf(String.valueOf(editTextDruga.getText()));

                int wynikDodawania = dodawanie.wynikDodawania(pierwsza, druga); //robie zmienna wynikDodawania i urzywajac metody wynik dodawania nadaje jej wartosc
                textViewHello.setText(pierwsza + " + " + druga + " = " + wynikDodawania); //i podstawiam tekst pod tekstviwhello

            }
        });
        buttonMnozenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mnozenie mnozenie = new Mnozenie();

                int pierwsza = Integer.valueOf(String.valueOf(editTextPierwsza.getText()));
                int druga = Integer.valueOf(String.valueOf(editTextDruga.getText()));

                int wynikMnozenia = mnozenie.wynikMnozenia(pierwsza, druga);
                textViewHello.setText(pierwsza + " * " + druga + " = " + wynikMnozenia);

            }
        });
    }

    public void setupViews() {
        button1 = (Button) findViewById(R.id.button1);
        buttonMnozenie = (Button) findViewById(R.id.buttonMnozenie);
        textViewHello = (TextView) findViewById(R.id.textViewHello);
        editTextPierwsza = (EditText) findViewById(R.id.editTextPierwsza);
        editTextDruga = (EditText) findViewById(R.id.editTextDruga);
        przepisanaPierwsza = (TextView) findViewById(R.id.przepisanaPierwsza);
        przepisanaDruga = (TextView) findViewById(R.id.przepisanaDruga);


    }

}
