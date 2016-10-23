package com.example.imnotvirus.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContaPassosActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnAumentar, btnDiminuir, btnZerar;
    private TextView nContador;
    private int cCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta_passos);

        btnAumentar = (Button)      findViewById(R.id.ContaPassos_btn_aumentar);
        btnDiminuir = (Button)      findViewById(R.id.ContaPassos_btn_diminuir);
        btnZerar    = (Button)      findViewById(R.id.ContaPassos_btn_zerar);

        nContador   = (TextView)    findViewById(R.id.ContaPassos_txt_contador);

        btnAumentar.setOnClickListener(this);
        btnDiminuir.setOnClickListener(this);
        btnZerar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnAumentar) {
            cCount++;
            nContador.setText(""+cCount);
        }
        if (v == btnDiminuir){
            cCount--;
            nContador.setText(""+cCount);
        }
        if (v == btnZerar){
            cCount = 0;
            nContador.setText(""+cCount);
        }
    }
}
