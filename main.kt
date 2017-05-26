package com.aaronstacy.app

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : Activity() {
  val message: TextView by lazy { findViewById(R.id.flerg) as TextView }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
    message.text = getString(R.string.hi)

    findViewById(android.R.id.content).setOnClickListener {
      Log.d("MainActivity", "click!")
    }
  }
}