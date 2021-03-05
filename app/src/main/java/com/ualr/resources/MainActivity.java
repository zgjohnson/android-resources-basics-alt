package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String country_description = getString(R.string.country_description);

        TextView msgTextView = (TextView) findViewById(R.id.country_description_text);
        msgTextView.setText(country_description);
        //msgTextView.setText(this.getResources().getText(R.string.country_description));
    }


    public void onLessonLearntClicked(View view) {
       Snackbar.make(findViewById(R.id.root_layout),this.getResources().getText(R.string.congrats_text),Snackbar.LENGTH_SHORT )
        .show();
    }
}
