package com.bridgeit.ipl2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.bridgeit.ipl2017.utility.Debug;
import com.bridgeit.ipl2017.view.LoginFragment;

/**
 * Auth :Sonawane Gokul
 * Date :22/1/2017
 * Disc :this will Load Login View
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Debug.showLog(TAG,"MAinActivity Started");
        // calling to Login Fragment


        getSupportFragmentManager().beginTransaction().replace(R.id.framemain, LoginFragment.newInstance(),LoginFragment.TAG).commit();

    }


}