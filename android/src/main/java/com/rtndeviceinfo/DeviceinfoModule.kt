package com.rtncdeviceinfo

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.rtncdeviceinfo.NativeRtnDeviceinfoSpec
import android.os.Build;

class DeviceinfoModule(reactContext: ReactApplicationContext) : NativeRtnDeviceinfoSpec(reactContext) {
  override fun getName() = NAME

  override fun getDeviceModel(promise: Promise) {
    promise.resolve(Build.MODEL)
  }

  companion object {
    const val NAME = "RTNDeviceinfo"
  }
}