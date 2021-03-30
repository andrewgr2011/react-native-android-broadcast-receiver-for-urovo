package com.ettingshausen;

import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAndroidBroadcastReceiverForScannerModule extends ReactContextBaseJavaModule {

    public static ReactApplicationContext reactContext;

    public RNAndroidBroadcastReceiverForScannerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAndroidBroadcastReceiverForUrovoScanner";
    }

    @ReactMethod
    public void getReferrerData(Promise promise) {
        Log.d("ReactNativeJS", "Inside getReferrerData in RNAndroidBroadcastReceiverForScannerModule");

        String referrerValue = "NOT AVAILABLE";

        if (ScannerBroadcastReceiver.content != null) {
            Log.d("ReactNativeJS", "ScannerBroadcastReceiver.referrer is not null. It is:" + ScannerBroadcastReceiver.content);
            referrerValue = ScannerBroadcastReceiver.content;
        }

        Log.d("ReactNativeJS", "Returning from getReferrerData in RNAndroidBroadcastReceiverForScannerModule. referrer is:" + referrerValue);
        promise.resolve(referrerValue);
    }
}