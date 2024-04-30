package com.rtndeviceinfo

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.rtndeviceinfo.NativeRtnDeviceinfoSpec
import android.os.Build;

class DeviceinfoModule(reactContext: ReactApplicationContext) : NativeRtnDeviceinfoSpec(reactContext) {
  override fun getName() = NAME

  override fun getDeviceModel(promise: Promise) {
    val manufacturer: String = Build.MANUFACTURER
    val model: String = Build.MODEL
    promise.resolve(manufacturer + " " + model)
  }

  companion object {
    const val NAME = "RTNDeviceinfo"
  }
}