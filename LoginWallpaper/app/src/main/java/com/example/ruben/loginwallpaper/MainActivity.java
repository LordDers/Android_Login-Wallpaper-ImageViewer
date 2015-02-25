package com.example.ruben.loginwallpaper;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Añadimos
        Button boton = (Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recoger lo que se introduce en los textView de usuario y password
                String usuario = ((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.txtpassword)).getText().toString();
                if (usuario.equals("admin") && password.equals("admin"))
                {
                    Intent nuevoform = new Intent(MainActivity.this,Secundario.class);
                    startActivity(nuevoform);
                }
                else if (usuario.equals("ruben") && password.equals("ruben"))
                {
                    Intent nuevoform2 = new Intent(MainActivity.this,Tercero.class);
                    startActivity(nuevoform2);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario y/o Password Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
