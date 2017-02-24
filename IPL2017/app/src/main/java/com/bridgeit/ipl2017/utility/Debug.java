package com.bridgeit.ipl2017.utility;

import android.util.Log;

/**
 * Created by bridgeit on 11/2/17.
 */

public class Debug {
    static boolean isDebuggable = true;
<<<<<<< HEAD

    public static void showLog(String tag, String message) {
        if (isDebuggable) {
            Log.i(tag, "showLog: " + message);
=======
    public static void showLog(String tag,String message){
        if(isDebuggable){
            Log.i(tag, "showLog: "+message);
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        }
    }
}
