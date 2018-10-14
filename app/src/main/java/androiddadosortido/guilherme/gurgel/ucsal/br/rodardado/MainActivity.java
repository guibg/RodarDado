package androiddadosortido.guilherme.gurgel.ucsal.br.rodardado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    boolean parado = false;
    TextView contador;
    ImageView imagemDado;
    Random rd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = findViewById(R.id.contador);
        imagemDado = findViewById(R.id.imagemDado);
    }


    public void rolar(View view) {
        Integer numero = rd.nextInt(6);
        numero++;
        if(!parado) {
            if (numero == 1) {
                imagemDado.setImageResource(R.drawable.dice1);
            } else if (numero == 2) {
                imagemDado.setImageResource(R.drawable.dice2);
            } else if (numero == 3) {
                imagemDado.setImageResource(R.drawable.dice3);
            } else if (numero == 4) {
                imagemDado.setImageResource(R.drawable.dice4);
            } else if (numero == 5) {
                imagemDado.setImageResource(R.drawable.dice5);
            } else {
                imagemDado.setImageResource(R.drawable.dice6);
            }
            contador.setText((numero += Integer.parseInt(String.valueOf(contador.getText()))).toString());
        }
    }

    public void parar(View view) {
        if(parado) {
            parado = false;
        }else{
            parado=true;
        }

    }

    public void reiniciar(View view) {
        parado = false;
        imagemDado.setImageResource(R.drawable.dice1);
        contador.setText("0");
    }
}

