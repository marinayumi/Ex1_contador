package br.com.fiap.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     int contador = 0;
    TextView txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtValor = (TextView)findViewById(R.id.txtValor);
    }

    public void decrementar (View v){
        if(contador > 0){
            contador = contador - 1;
        }else{
            Toast.makeText(this, "Contador só pode decrementar até 0", Toast.LENGTH_SHORT).show();
        }
        txtValor.setText("" + contador);
    }


    public void incrementar (View v){
        if(contador < 10){
            contador++;
        }else{
            Toast.makeText(this, "Contador só pode incrementar até 10", Toast.LENGTH_SHORT).show();
        }
        txtValor.setText("" + contador);
    }

}
