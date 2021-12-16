package edu.hdu.android.intentreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends ... {
    public void ...(Context context, Intent intent) {
        CharSequence string = "Received message on behalf of Receiver";
        Toast.makeText(context, string, Toast.LENGTH_LONG).show();
    }
}
