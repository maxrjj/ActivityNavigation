package com.estudos.mvasconcelos.activitynavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btTela = (Button)findViewById(R.id.btTela1);
        btTela.setOnClickListener(onClickBt());

    }

    private View.OnClickListener onClickBt(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText texto = (EditText)findViewById(R.id.txtTela1);
                Intent intent = new Intent(getContext(),TelaDois.class);
                Bundle params = new Bundle();
                params.putString("nome",texto.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        };

    }

    private Context getContext (){return this;}
}
