package com.example.oktan.pierwszawandroidzie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private TextView textViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        textViewHello.setText("asdfghjklgggggggggg;");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void setupViews(){
        button1=(Button)findViewById(R.id.button1);
        textViewHello=(TextView) findViewById(R.id.textViewHello);

    }

}
