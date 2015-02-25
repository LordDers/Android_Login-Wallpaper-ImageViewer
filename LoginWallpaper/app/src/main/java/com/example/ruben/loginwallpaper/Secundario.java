package com.example.ruben.loginwallpaper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.WallpaperManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;

/**
 * Created by ruben on 24/02/15.
 */
public class Secundario extends ActionBarActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       //Llamar al secundario layout
       setContentView(R.layout.segundolayout);
       ImageView miimagen = (ImageView) findViewById(R.id.image_wallpaper);
       Button btnwallpaper = (Button) findViewById(R.id.btnwallpaper);
       miimagen.setImageResource(R.drawable.wallpaper2);
       btnwallpaper.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               WallpaperManager manejador = WallpaperManager.getInstance(getBaseContext());
               try {
                   manejador.setResource(R.drawable.wallpaper2);
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }
       });
   }
}
