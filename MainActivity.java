package com.example.user.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.user.menu.R;

/**
 * This is an android studio project with name- Menu
 * change the first line of this document according to your project name
 * e.g. package com.example.user.projectName
 * This code showcases how to extract (get) a text information from
 * an existing XML TextView. When a button is clicked on the screen,
 * the three different Texts of three different TextViews are called
 * and printed to the logcat using Log.i method.
 * Created on: 28th August,2016 by Bhagyesh Pathak
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Finds the first text from the TextView and prints the text to the logs
        TextView firstItemToLog = (TextView) findViewById(R.id.menu_item_1);
        String firstLog = firstItemToLog.getText().toString();
        Log.i("Log Item 1", firstLog);


        // Finds the second text from the TextView and prints the text to the logs
        TextView secondItemToLog = (TextView) findViewById(R.id.menu_item_2);
        String secondLog = secondItemToLog.getText().toString();
        Log.i("Log Item 2", secondLog);

        // Finds the third text from the TextView and prints the text to the logs
        TextView thirdItemToLog = (TextView) findViewById(R.id.menu_item_3);
        String thirdLog = thirdItemToLog.getText().toString();
        Log.i("Log Item 3", thirdLog);

    }
}
