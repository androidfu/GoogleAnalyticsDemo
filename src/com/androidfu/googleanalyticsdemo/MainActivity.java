package com.androidfu.googleanalyticsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.androidfu.library.googleanalytics.AnalyticsUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup Tracker with context and our key.
        //AnalyticsUtils.configure(getApplication(), GOOGLE_ANALYTICS_KEY);

        // Track PageView
        AnalyticsUtils.getInstance().trackPageView("path");

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Track Event
                AnalyticsUtils.getInstance().trackEvent("category", "action", "label", 0);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
