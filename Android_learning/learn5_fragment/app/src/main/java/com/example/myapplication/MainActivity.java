package com.example.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentmanager = getFragmentManager();
        FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LandscapeFragment ls_fragment = new LandscapeFragment();
            fragmenttransaction.replace(R.id.content, ls_fragment);
        }
        else {
            PortraitFragment pm_fragment = new PortraitFragment();
            fragmenttransaction.replace(R.id.content, pm_fragment);
        }
        fragmenttransaction.commit();
    }

}
