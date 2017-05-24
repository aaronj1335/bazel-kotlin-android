package com.aaronstacy.test

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
    findViewById(android.R.id.content).setOnClickListener {
      Log.d("BLERG", "BLAG")
    }
  }
}
