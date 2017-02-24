package com.bridgeit.ipl2017.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.bridgeit.ipl2017.R;
import com.bridgeit.ipl2017.utility.Debug;

public class IPLLoad extends AppCompatActivity {
    private static final String TAG = "IPLLoad";
    private FloatingActionButton mFabLogout;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iplload);

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
    }
}
