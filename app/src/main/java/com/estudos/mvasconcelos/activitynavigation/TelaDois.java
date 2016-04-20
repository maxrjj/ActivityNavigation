package com.estudos.mvasconcelos.activitynavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaDois extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);

        //recebe o nome enviado por parametro
        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");

        TextView text = (TextView)findViewById(R.id.txtViewRecebe);
        text.setText(nome);

    }
}
