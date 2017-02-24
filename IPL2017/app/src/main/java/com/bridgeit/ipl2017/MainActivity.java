package com.bridgeit.ipl2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
=======
import android.widget.Button;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
import com.bridgeit.ipl2017.utility.Debug;
import com.bridgeit.ipl2017.view.LoginFragment;

/**
 * Auth :Sonawane Gokul
 * Date :22/1/2017
 * Disc :this will Load Login View
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


<<<<<<< HEAD
=======

>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        Debug.showLog(TAG, "MAinActivity Started");
        // calling to Login Fragment
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
       /* getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_back);
        getSupportActionBar().setHomeButtonEnabled(true);
*/
        getSupportFragmentManager().beginTransaction().replace(R.id.framemain, LoginFragment.newInstance(), LoginFragment.TAG).commit();

    }

=======
        Debug.showLog(TAG,"MAinActivity Started");
        // calling to Login Fragment


        getSupportFragmentManager().beginTransaction().replace(R.id.framemain, LoginFragment.newInstance(),LoginFragment.TAG).commit();

    }


>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
}