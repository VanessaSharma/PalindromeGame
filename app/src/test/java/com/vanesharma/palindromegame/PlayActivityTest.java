package com.vanesharma.palindromegame;

import android.content.Intent;
import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;


@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class PlayActivityTest {
    private PlayActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(PlayActivity.class);
    }

    @Test
    public void validateTextViewContent(){
        TextView titleTextView = (TextView) activity.findViewById(R.id.promptTextView);
        assertTrue("Check to see if your word is a palindrome!".equals(titleTextView.getText().toString()));
    }
    @Test
    public void validateEditViewContent(){
        TextView titleTextView = (EditText) activity.findViewById(R.id.userWordEditText);
        assertTrue("Enter your word!".equals(titleTextView.getText().toString()));
    }
    @Test
    public void resultsActivityStarted() {
        activity.findViewById(R.id.enterButton).performClick();
        Intent expectedIntent = new Intent(activity, PalindromeActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));

    }
}
