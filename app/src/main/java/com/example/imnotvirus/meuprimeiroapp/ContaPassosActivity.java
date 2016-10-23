package com.example.imnotvirus.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContaPassosActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnZerar;
    private TextView nContador;
    private int cCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra_tela);

        btnZerar = (Button) findViewById(R.id.ContaPassos_btn_zerar);
        nContador = (TextView) findViewById(R.id.ContaPassos_txt_contador);

        btnZerar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnZerar) {
            cCount++;
            nContador.setText(""+cCount);

        }
    }
}
