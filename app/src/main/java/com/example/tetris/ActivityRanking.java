package com.example.tetris;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class ActivityRanking extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

    }

    public void volverAlMenu(View view){
        finish();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
