package com.example.victordias.atandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btJogarnovamente;
    TextView msg;
    ImageButton cartaSelecionada, carta1 , carta2 , carta3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btJogarnovamente = (Button) findViewById(R.id.btJogarNovamente);
        msg = (TextView) findViewById(R.id.tvView);
        carta1 = (ImageButton) findViewById(R.id.imageButton12);
        carta2 = (ImageButton) findViewById(R.id.imageButton13);
        carta3 = (ImageButton) findViewById(R.id.imageButton14);


    }

    void clickcarta (View view){

        imagehabilitada(false);

        cartaSelecionada = (ImageButton) view;

        Random random = new Random();

        if (random.nextBoolean()){

            this.cartaSelecionada.setImageResource(R.drawable.vencedor);
            msg.setText("Você Venceu !");



        }else{

            this.cartaSelecionada.setImageResource(R.drawable.coringa);
            msg.setText("Você perdeu !");

        }
    }

    void imagehabilitada (boolean b){

        carta1.setEnabled(b);
        carta2.setEnabled(b);
        carta3.setEnabled(b);


    }

    void jogoNovo(View view){

        cartaSelecionada.setImageResource(R.drawable.traseira);

        imagehabilitada(true);

        String limpaTextView = "";

        msg.setText(limpaTextView);
    }


}
