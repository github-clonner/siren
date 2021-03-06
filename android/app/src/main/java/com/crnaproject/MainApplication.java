package com.crnaproject;

import android.app.Application;

import com.reactnativenavigation.NavigationApplication;
import com.dylanvann.fastimage.FastImageViewPackage;
import com.cmcewen.blurview.BlurViewPackage;
import cc.rocwang.aescrypto.AesCryptoPackage;
import guichaguri.trackplayer.TrackPlayer;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.BV.LinearGradient.LinearGradientPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends NavigationApplication {

  @Override
  public boolean isDebug() {
      // Make sure you are using BuildConfig from your own application
      return BuildConfig.DEBUG;
  }

  protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
          new FastImageViewPackage(),
          new TrackPlayer(),
          new BlurViewPackage(),
          new AesCryptoPackage(),
          new LinearGradientPackage()
    );
  }

  @Override
  public List<ReactPackage> createAdditionalReactPackages() {
      return getPackages();
  }

  @Override
  public String getJSMainModuleName() {
    return "index";
  }
}
