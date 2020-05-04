package com.soict.hoangviet.broadcastreceiver.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.util.Log
import com.soict.hoangviet.broadcastreceiver.extension.isNetworkConnection
import com.soict.hoangviet.broadcastreceiver.util.Define

class Broadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            ConnectivityManager.CONNECTIVITY_ACTION -> {
                if (context!!.isNetworkConnection()) {
                    Log.d("myLog", "Network Connected")
                }
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Log.d("myLog", "Airplane Mode Changed")
            }
            Define.Broadcast.CUSTOM_ACTION -> {
                Log.d("myLog", "Custom Action Changed")
                Log.d("myLog", intent.extras?.getString(Define.Broadcast.NAME)?:"anonymous")
            }
        }
    }
}