package com.soict.hoangviet.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.soict.hoangviet.broadcastreceiver.broadcast.Broadcast
import com.soict.hoangviet.broadcastreceiver.util.Define
import kotlinx.android.synthetic.main.activity_main.*


class ReceiverActivity : AppCompatActivity() {
    private val mBroadcast = Broadcast()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LocalBroadcastManager.getInstance(applicationContext)
            .registerReceiver(mBroadcast, IntentFilter(Define.Broadcast.CUSTOM_ACTION))
        btn.setOnClickListener {
            startActivity(Intent(this, SenderActivity::class.java))
        }
    }

    override fun onDestroy() {
        LocalBroadcastManager.getInstance(applicationContext).unregisterReceiver(mBroadcast)
        super.onDestroy()
    }
}