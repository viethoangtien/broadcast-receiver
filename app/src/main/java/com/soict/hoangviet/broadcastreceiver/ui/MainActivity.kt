package com.soict.hoangviet.broadcastreceiver

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.soict.hoangviet.broadcastreceiver.broadcast.Broadcast


class MainActivity : AppCompatActivity() {
    private var broadcast: Broadcast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        broadcast = Broadcast()
        registerReceiver(broadcast, IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcast)
    }
}
