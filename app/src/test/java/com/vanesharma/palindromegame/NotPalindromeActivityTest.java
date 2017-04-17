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

public class NotPalindromeActivityTest {
    private NotPalindromeActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(NotPalindromeActivity.class);
    }

    @Test
    public void validateTextViewContent(){
        TextView notPalindromeTextView = (TextView) activity.findViewById(R.id.notPalindromeTextView);
        assertTrue("Sorry, you're word is not a palindrome!".equals(notPalindromeTextView.getText().toString()));
    }
    @Test
    public void mainActivityStarted() {
        activity.findViewById(R.id.replayButton2).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));

    }
}