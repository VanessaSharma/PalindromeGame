package com.vanesharma.palindromegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.titleTextView) TextView mTitleTextView;
    @Bind(R.id.startButton) Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mStartButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v == mStartButton){
            Intent intent = new Intent(MainActivity.this, PlayActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}

