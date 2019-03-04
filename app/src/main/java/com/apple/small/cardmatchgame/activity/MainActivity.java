package com.apple.small.cardmatchgame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.apple.small.cardmatchgame.R;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button_activity = (Button) this.findViewById(R.id.button2);
        button_activity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, CardMatchActivity.class);
                startActivity(intent);
            }
        });

    }
}
