package br.edu.ifsp.scl.ads.pdm.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.pdm.contador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // objeto da classe de ligação com o layout, cada activity tem uma dessa
    private ActivityMainBinding amb;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        amb.inicialSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posicao, long idObjeto) {
                contador = (posicao == 0) ? 0 : (posicao == 1) ? 5 : 10;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


//        // esse trecho vale para o radio group
//        amb.zeroRb.setOnClickListener(view -> {
//            contador = 0;
//            Toast.makeText(this, "Clicou no zero", Toast.LENGTH_SHORT).show();
//        });
//
//        amb.dezRb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                contador = 10;
//                Toast.makeText(MainActivity.this, "Clicou no dez", Toast.LENGTH_SHORT).show();
//            }
//        });


        // esse trecho vale para o checkbox
//        amb.inicialCb.setOnClickListener( (view) -> {
//            if (amb.inicialCb.isChecked()) {
//                contador = Integer.parseInt(amb.inicialCb.getText().toString());
//            }
//        });

//        cliqueBt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                contador++;
//                contadorTv.setText(String.valueOf(contador));
//            }
//        });

        amb.clickBt.setOnClickListener(
                (view -> amb.contadorTv.setText(String.valueOf(++contador)))
        );


    }
}