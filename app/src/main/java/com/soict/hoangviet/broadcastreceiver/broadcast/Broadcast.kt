package com.soict.hoangviet.broadcastreceiver.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.soict.hoangviet.broadcastreceiver.extension.isNetworkConnection

class Broadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (context!!.isNetworkConnection()) {
            Log.d("myLog", "Network Connected")
        }
    }
}