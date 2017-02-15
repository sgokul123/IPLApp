package com.bridgeit.ipl2017.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.bridgeit.ipl2017.R;
import com.bridgeit.ipl2017.utility.Debug;

public class IPLLoad extends AppCompatActivity {
    private static final String TAG = "IPLLoad";
    private  static Button mButtonLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iplload);
        Debug.showLog(TAG,"Load Teams Started");
        // calling to Login Fragment
        mButtonLogout=(Button)findViewById(R.id.button_logout);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameload,TeamFragment.newInstance(mButtonLogout),TeamFragment.TAG).commit();

    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        super.onBackPressed();
    }
}
