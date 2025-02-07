package com.example.ejertema5.ejer5_1;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ejertema5.R;

public class Ejer5_1_d extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ejer5_1_d);
        TextView texto = findViewById(R.id.textoConst);

        Typeface mifuente = Typeface.createFromAsset(getAssets(), "fonts/modak_regular.ttf");
        texto.setTypeface(mifuente);


        Button btn1, btn2, btn3;
        btn1 = findViewById(R.id.pantallaB);
        btn2 = findViewById(R.id.pantallaC);
        btn3 = findViewById(R.id.pantallaA);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pantallaB:
                Intent abrir5_1_b = new Intent(this, Ejer5_1_b.class);
                this.startActivity(abrir5_1_b);
                break;
            case R.id.pantallaC:
                Intent abrir5_1_c = new Intent(this, Ejer5_1_c.class);
                this.startActivity(abrir5_1_c);
                break;
            case R.id.pantallaA:
                Intent abrir5_1a = new Intent(this, Ejer5_1a.class);
                this.startActivity(abrir5_1a);
                break;
            default:
                break;
        }
    }

}