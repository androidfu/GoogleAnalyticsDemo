package com.androidfu.googleanalyticsdemo;

import android.app.Application;

import com.androidfu.library.googleanalytics.AnalyticsUtils;

public class GoogleAnalyticsDemoApplication extends Application {

    private static final String GOOGLE_ANALYTICS_KEY = "UA-44419856-1";
    private static final boolean ANALYTICS_ENABLED = true;

    @Override
    public void onCreate() {
        super.onCreate();
        AnalyticsUtils.configure(this, GOOGLE_ANALYTICS_KEY);
        AnalyticsUtils.getInstance().setAnalyticsEnabled(ANALYTICS_ENABLED);
    }
}
