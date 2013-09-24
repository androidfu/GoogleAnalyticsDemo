package com.androidfu.googleanalyticsdemo;

import android.app.Application;

import com.androidfu.library.googleanalytics.AnalyticsUtils;

public class GoogleAnalyticsDemoApplication extends Application {

    private static final String GOOGLE_ANALYTICS_KEY = "some key";

    public GoogleAnalyticsDemoApplication() {

    }

    @Override
    public void onCreate() {
        AnalyticsUtils.configure(GOOGLE_ANALYTICS_KEY);

        // Track Event
        AnalyticsUtils.getInstance(this).trackEvent("category", "action", "label", 0);

        super.onCreate();
    }

}
