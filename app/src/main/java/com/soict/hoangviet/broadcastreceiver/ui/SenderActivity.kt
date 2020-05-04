package com.soict.hoangviet.broadcastreceiver

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.soict.hoangviet.broadcastreceiver.broadcast.Broadcast
import com.soict.hoangviet.broadcastreceiver.util.Define
import kotlinx.android.synthetic.main.activity_main.*


class SenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage() {
        Log.d("myLog", "Broadcasting message")
        val intent = Intent(Define.Broadcast.CUSTOM_ACTION).apply {
            // You can also include some extra data.
            intent.putExtra(Define.Broadcast.NAME, "viet.hoangtien")
        }
        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent)
    }
}