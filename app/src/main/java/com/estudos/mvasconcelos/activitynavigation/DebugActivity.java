package com.estudos.mvasconcelos.activitynavigation;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by maxrj on 20/04/2016.
 */
public class DebugActivity extends Activity{
    protected static final String TAG = "Livro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, getClassName() + "onCreate chamando: " +  savedInstanceState);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClassName() + ".onStart chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, getClassName() + ".onRestart chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getClassName() + ".onResume chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getClassName() + ".onPause chamado.");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getClassName() + ".onStop chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getClassName() + ".onDestroy chamado.");
    }

    private String getClassName(){
        //retorna o nome da classe sem o pacote
        String nomeClasse = getClass().getName();
        return nomeClasse.substring(nomeClasse.lastIndexOf("."));

    }


}
