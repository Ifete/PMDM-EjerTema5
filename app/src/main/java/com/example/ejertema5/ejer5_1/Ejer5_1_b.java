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

public class Ejer5_1_b extends AppCompatActivity implements View.OnClickListener{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.ejer5_1_b);

            TextView textoConst = findViewById(R.id.textoConst);
            textoConst.setText("Texto construido desdes Java \n Tamaño 20 dp, italic y color Blue");
            textoConst.setTextColor(getColor(R.color.blue));
            textoConst.setTextSize(20);
            textoConst.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pantallaA:
                Intent abrir5_1a = new Intent(this, Ejer5_1a.class);
                this.startActivity(abrir5_1a);
                break;
            case R.id.pantallaC:
                Intent abrir5_1_c = new Intent(this, Ejer5_1_c.class);
                this.startActivity(abrir5_1_c);
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
