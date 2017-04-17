package com.vanesharma.palindromegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PalindromeActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.palindromeTextView) TextView mNotPalindromeTextView;
    @Bind(R.id.replayButton) Button mReplayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
        ButterKnife.bind(this);

        mReplayButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v == mReplayButton){
            Intent intent = new Intent(PalindromeActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(PalindromeActivity.this, PalindromeActivity.class);
            startActivity(intent);
        }
    }
}

