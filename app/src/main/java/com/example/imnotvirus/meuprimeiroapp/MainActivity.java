package com.example.imnotvirus.meuprimeiroapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String CICLODEVIDA = "ciclodevida";

    private Button btnLigar;
    private Button btnOutraTela;
    private Button btnLoginPage;
    private Button btnFullScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLigar        = (Button) findViewById(R.id.main_btn_ligar);
        btnOutraTela    = (Button) findViewById(R.id.main_btn_outra_tela);
        btnLoginPage    = (Button) findViewById(R.id.main_btn_login_page);
        btnFullScreen   = (Button) findViewById(R.id.main_btn_full_screen);

        btnLigar.setOnClickListener(this);
        btnOutraTela.setOnClickListener(this);
        btnLoginPage.setOnClickListener(this);
        btnFullScreen.setOnClickListener(this);

        Log.d(CICLODEVIDA,"BATATA_log: Metodo create executado..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(CICLODEVIDA,"BATATA_log: Metodo restart executado..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(CICLODEVIDA,"BATATA_log: Metodo start executado..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(CICLODEVIDA,"BATATA_log: Metodo resume executado..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(CICLODEVIDA,"BATATA_log: Metodo pause executado..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(CICLODEVIDA,"BATATA_log: Metodo stop executado..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(CICLODEVIDA,"BATATA_log: Metodo Destroy executado..");
    }

    @Override
    public void onClick(View view) {

        if (view == btnLigar ) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            startActivity(intent);
        }

        if (view == btnOutraTela){
            Intent i = new Intent(this, OutraTelaActivity.class);
            startActivity(i);
        }

        if (view == btnLoginPage){
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }

        if (view == btnFullScreen){
            Intent i = new Intent(this, FullscreenActivity.class);
        }

    }
}
