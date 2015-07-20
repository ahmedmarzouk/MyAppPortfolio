package com.sandcodehero.myappportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

    Button btnSpotifyStreamer,btnScores, btnLibraryApp, btnBuildItBigger, btnXYZReader, btnMyOwnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotifyStreamer = (Button)findViewById(R.id.btnSpotifyStreamer);
        btnScores = (Button)findViewById(R.id.btnScores);
        btnLibraryApp = (Button)findViewById(R.id.btnLibraryApp);
        btnBuildItBigger = (Button)findViewById(R.id.btnBuildItBigger);
        btnXYZReader = (Button)findViewById(R.id.btnXYZReader);
        btnMyOwnApp = (Button)findViewById(R.id.btnMyOwnApp);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnMyOwnApp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
    }
}
