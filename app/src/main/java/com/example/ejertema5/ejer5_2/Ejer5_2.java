package com.example.ejertema5.ejer5_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ejertema5.R;
import com.example.ejertema5.ejer5_1.Ejer5_1_b;
import com.example.ejertema5.ejer5_1.Ejer5_1_c;
import com.example.ejertema5.ejer5_1.Ejer5_1_d;
import com.example.ejertema5.ejer5_1.Ejer5_1a;

public class Ejer5_2 extends AppCompatActivity implements View.OnClickListener {

    TextView miTexto;
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_ejercicios,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ejer5_2);
        miTexto= findViewById(R.id.txtAnim);

        Button btn1;
        btn1 = findViewById(R.id.btnAnim);
        btn1.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.animation);
        miAnimacion.setRepeatMode(Animation.RESTART);
        miAnimacion.setRepeatCount(20);
        miTexto.startAnimation(miAnimacion);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.ejer5_1:
                Intent abrirEjer5_1 = new Intent(this, Ejer5_1a.class);
                this.startActivity(abrirEjer5_1);
                return false;
            case R.id.ejer5_2:
                Intent abrirEjer5_2 = new Intent(this, Ejer5_2.class);
                this.startActivity(abrirEjer5_2);
                return false;
            case R.id.ejer5_3:
                Intent abrirEjer5_3 = new Intent(this, Ejer5_1_d.class);
                this.startActivity(abrirEjer5_3);
                return false;
            case R.id.ejer5_4:
                Intent abrirEjer5_4 = new Intent(this, Ejer5_1_b.class);
                this.startActivity(abrirEjer5_4);
                return false;
            case R.id.ejer5_5:
                Intent abrirEjer5_5 = new Intent(this, Ejer5_2.class);
                this.startActivity(abrirEjer5_5);
                return false;
            case R.id.ejer5_6:
                Intent abrirEjer5_6 = new Intent(this, Ejer5_2.class);
                this.startActivity(abrirEjer5_6);
                return false;
            case R.id.ejer5_7:
                Intent abrirEjer5_7 = new Intent(this, Ejer5_2.class);
                this.startActivity(abrirEjer5_7);
                return false;
            default:
                return false;
        }
    }

}