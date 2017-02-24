package com.bridgeit.ipl2017.view;

<<<<<<< HEAD
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
=======
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
import android.widget.Button;

import com.bridgeit.ipl2017.R;
import com.bridgeit.ipl2017.utility.Debug;

public class IPLLoad extends AppCompatActivity {
    private static final String TAG = "IPLLoad";
<<<<<<< HEAD
    private FloatingActionButton mFabLogout;

    FragmentManager fragmentManager;
=======
    private  static Button mButtonLogout;

>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iplload);
<<<<<<< HEAD

        fragmentManager = getSupportFragmentManager();
        Debug.showLog(TAG, "Load Teams Started");
        // calling to Login Fragment

        fragmentManager.beginTransaction().replace(R.id.frameload, TeamFragment.newInstance(), TeamFragment.TAG).commit();

    }

    @Override
    public void onBackPressed() {

        if(fragmentManager.getBackStackEntryCount() > 0){
            fragmentManager.popBackStackImmediate();
        /* if(fragmentManager.findFragmentByTag(TeamFragment.TAG) instanceof TeamFragment){

         }   */
        }
        else {
            moveTaskToBack(true);
            super.onBackPressed();
        }
=======
        Debug.showLog(TAG,"Load Teams Started");
        // calling to Login Fragment
        mButtonLogout=(Button)findViewById(R.id.button_logout);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameload,TeamFragment.newInstance(mButtonLogout),TeamFragment.TAG).commit();

    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        super.onBackPressed();
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    }
}
