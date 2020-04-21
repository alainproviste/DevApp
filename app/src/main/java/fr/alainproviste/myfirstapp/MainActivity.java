package fr.alainproviste.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button nouvellepartie;
    private Button chargerpartie;
    private Button parametres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nouvellepartie = (Button) findViewById(R.id.button);

        this.chargerpartie = (Button) findViewById(R.id.button2);

        this.parametres = (Button) findViewById(R.id.button3);

        nouvellepartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),CreateGame.class);
                startActivity(otherActivity);
                finish();
            }
        });

        chargerpartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),LoadingGame.class);
                startActivity(otherActivity);
                finish();
            }
        });

        parametres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),Settings.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}
