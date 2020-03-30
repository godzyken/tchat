package com.godzy.tchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_flutter.setOnClickListener {
            // start flutter activity

            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
        }

        btn_react_native.setOnClickListener {
            // start react native activity
        }
    }
}
