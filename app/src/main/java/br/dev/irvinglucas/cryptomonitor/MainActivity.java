package br.dev.irvinglucas.cryptomonitor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Random;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void reloadButtonClick(View view) {

        TextView coinValue1 = findViewById(R.id.coin_value_1);
        TextView coinValue2 = findViewById(R.id.coin_value_2);
        TextView coinValue3 = findViewById(R.id.coin_value_3);
        TextView coinValue4 = findViewById(R.id.coin_value_4);

        String aux;
        Random random = new Random();

        aux = String.valueOf(random.nextInt());
        coinValue1.setText(aux);
        coinValue2.setText(aux);
        coinValue3.setText(aux);
        coinValue4.setText(aux);
    }

}

