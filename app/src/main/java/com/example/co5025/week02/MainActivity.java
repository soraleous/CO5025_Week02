package com.example.co5025.week02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butNewGame = (Button) findViewById(R.id.new_game_button);
        butNewGame.setOnClickListener(this);
        Button butContGame = (Button) findViewById(R.id.continue_button);
        butContGame.setOnClickListener(this);
        Button butAboutGame = (Button) findViewById(R.id.about_button);
        butAboutGame.setOnClickListener(this);
        Button butExitGame = (Button) findViewById(R.id.exit_button);
        butExitGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId())	{
            case R.id.exit_button:
                finish();
                break;
            case R.id.about_button:
                i =	new	Intent(this,	About.class);
                startActivity(i);
                break;
        }
    }
}
