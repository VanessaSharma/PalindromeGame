package com.vanesharma.palindromegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener  {
    @Bind(R.id.promptTextView) TextView mPromptTextView;
    @Bind(R.id.userWordEditText) EditText mUserWordEditText;
    @Bind(R.id.enterButton) Button mEnterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ButterKnife.bind(this);

        mEnterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mEnterButton){
            Intent intent = new Intent(PlayActivity.this, ResultsActivity.class);
            startActivity(intent);
        }
    }
}

