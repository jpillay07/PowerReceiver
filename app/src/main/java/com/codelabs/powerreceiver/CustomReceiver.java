package com.codelabs.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST =
            BuildConfig.APPLICATION_ID + "ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        String toastMessage = "Unnown intent action.";

        if(intentAction != null){

            switch(intentAction){
                case Intent.ACTION_POWER_CONNECTED:
                        toastMessage = "Power Connected.";
                        break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power Disconnected.";
                    break;
                case ACTION_CUSTOM_BROADCAST:
                    toastMessage = "Custom Broadcast Received";
                    break;
            }
        }

        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();


    }
}
