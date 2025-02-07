package com.example.ejertema5.ejer5_1;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ejertema5.R;

public class Ejer5_1_c extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ejer5_1_c);

        TextView textoConst = findViewById(R.id.textoConstXml);

        TextView textoConstjava = new TextView(this);
        textoConstjava.setText("\n texto añadido con Append desde Java");
        textoConstjava.setTextColor(getColor(R.color.blue));
        textoConstjava.setTextSize(20);
        textoConstjava.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));

        textoConst.append(textoConstjava.getText());


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pantallaB:
                Intent abrir5_1_b = new Intent(this, Ejer5_1_b.class);
                this.startActivity(abrir5_1_b);
                break;
            case R.id.pantallaA:
                Intent abrir5_1a = new Intent(this, Ejer5_1a.class);
                this.startActivity(abrir5_1a);
                break;
            case R.id.pantallaD:
                Intent abrir5_1_d = new Intent(this, Ejer5_1_d.class);
                this.startActivity(abrir5_1_d);
                break;
            default:
                break;
        }
    }

}