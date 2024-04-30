package com.rtndeviceinfo;

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider

class DeviceinfoPackage : TurboReactPackage() {
  // override fun getModule(name: String?, reactContext: ReactApplicationContext): NativeModule? = null
  override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? =
  if (name == DeviceinfoModule.NAME) {
    DeviceinfoModule(reactContext)
  } else {
    null
  }

  // override fun getReactModuleInfoProvider(): ReactModuleInfoProvider? = null
  override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
    mapOf(
      DeviceinfoModule.NAME to ReactModuleInfo(
        DeviceinfoModule.NAME,
        DeviceinfoModule.NAME,
        false, // canOverrideExistingModule
        false, // needsEagerInit
        true, // hasConstants
        false, // isCxxModule
        true // isTurboModule
      )
    )
  }
}