package xyz.phyoekhant.padcweek4;

import android.app.Application;
import android.content.Context;

/**
 * Created by Phyoe Khant on 6/28/2016.
 */
public class PADCWeek4App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
