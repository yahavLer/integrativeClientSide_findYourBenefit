package com.example.a2024b_integrative_client;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        ImageLoader.init(this);

        My_Signal.init(this);
    }
}
