package com.example.ruben.loginwallpaper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;

/**
 * Created by ruben on 24/02/15.
 */
public class Tercero extends ActionBarActivity implements OnClickListener {

    ImageView foto;
    TextView tv;
    //Agrupar imagenes
    int[] fotoId = {R.drawable.foto1, R.drawable.foto2, R.drawable.foto3, R.drawable.foto4};
    //Cambiar el texto de cada imagen
    String[] textos = {"Gato 1", "Gato 2", "Gato 3", "Gato 4"};
    int i = 0;
    //Total array
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Llamar al secundario layout
        setContentView(R.layout.tercerlayout);

        Button Anterior = (Button) findViewById(R.id.button1);
        Button Siguiente = (Button) findViewById(R.id.button2);
        Anterior.setOnClickListener(this);
        Siguiente.setOnClickListener(this);

        // activity_main --> id de ImageView
        // R --> Recursos
        foto = (ImageView) findViewById(R.id.imageView1);
        tv = (TextView) findViewById(R.id.textView1);
        total = fotoId.length;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        //v.getId()--> Retorna identificador que se encuentra en la vista de nuestra pantalla de android
        int id = v.getId();
        if (id == R.id.button1) {
            i--;
            if (i == -1) {
                // i = 3;
                i = total - 1;
            }
        }

        if (id == R.id.button2) {
            i++;
            if (i == total) {
                i = 0;
            }
        }

        foto.setImageResource(fotoId[i]);
        tv.setText(textos[i]);
    }
}