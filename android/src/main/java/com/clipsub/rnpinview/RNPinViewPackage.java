package com.clipsub.rnpinview;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.List;

public class RNPinViewPackage implements ReactPackage {
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return null;
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    ReactTextInputManager reactTextInputManager = new ReactTextInputManager();
    return Arrays.<ViewManager>asList(reactTextInputManager);
  }
}
