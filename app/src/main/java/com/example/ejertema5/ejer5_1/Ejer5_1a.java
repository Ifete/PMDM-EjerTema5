package com.example.ejertema5.ejer5_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ejertema5.R;

public class Ejer5_1a extends AppCompatActivity implements View.OnClickListener {

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_ejercicios,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ejer5_1_a);
        Button btn1, btn2, btn3;
        btn1 = findViewById(R.id.pantallaB);
        btn2 = findViewById(R.id.pantallaC);
        btn3 = findViewById(R.id.pantallaD);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pantallaB:
                Log.v("Ejer5_1a", "pantallaB");
                Intent abrir5_1_b = new Intent(this, Ejer5_1_b.class);
                this.startActivity(abrir5_1_b);
                break;
            case R.id.pantallaC:
                Log.v("Ejer5_1a", "pantallaC");
                Intent abrir5_1_c = new Intent(this, Ejer5_1_c.class);
                this.startActivity(abrir5_1_c);
                break;
            case R.id.pantallaD:
                Log.v("Ejer5_1a", "pantallaD");
                Intent abrir5_1_d = new Intent(this, Ejer5_1_d.class);
                this.startActivity(abrir5_1_d);
                break;
            default:
                Log.v("Ejer5_1a", "default");
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.ejer5_1:
                Intent abrirEjer5_1 = new Intent(this, com.example.ejertema5.ejer5_1.Ejer5_1a.class);
                this.startActivity(abrirEjer5_1);
                return false;
            case R.id.ejer5_2:
                Intent abrirEjer5_2 = new Intent(this, com.example.ejertema5.ejer5_2.Ejer5_2.class);
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
                Intent abrirEjer5_5 = new Intent(this, com.example.ejertema5.ejer5_1.Ejer5_1a.class);
                this.startActivity(abrirEjer5_5);
                return false;
            case R.id.ejer5_6:
                Intent abrirEjer5_6 = new Intent(this, com.example.ejertema5.ejer5_1.Ejer5_1a.class);
                this.startActivity(abrirEjer5_6);
                return false;
            case R.id.ejer5_7:
                Intent abrirEjer5_7 = new Intent(this, com.example.ejertema5.ejer5_1.Ejer5_1a.class);
                this.startActivity(abrirEjer5_7);
                return false;
            default:
                return false;
        }
    }

}