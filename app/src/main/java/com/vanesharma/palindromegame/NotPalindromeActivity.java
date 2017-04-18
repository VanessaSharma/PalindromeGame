package com.vanesharma.palindromegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NotPalindromeActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.notPalindromeTextView) TextView mNotPalindromeTextView;
    @Bind(R.id.replayButton2) Button mReplayButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_palindrome);
        ButterKnife.bind(this);

        mReplayButton2.setOnClickListener(this);
    }
        @Override
        public void onClick(View v){
            if(v == mReplayButton2){
                Intent intent = new Intent(NotPalindromeActivity.this, PlayActivity.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(NotPalindromeActivity.this, NotPalindromeActivity.class);
                startActivity(intent);
            }
        }
    }


