
# react-native-android-broadcast-receiver-for-urovo

## Notice 
> As static broadcast can't be receive on Android 8.0 above, `targetSdkVersion` should be 25 or lower.

## Getting started

`$ yarn add react-native-android-broadcast-receiver-for-urovo`

### Mostly automatic installation

`$ react-native link react-native-android-broadcast-receiver-for-urovo`



## Usage
```javascript
import { DeviceEventEmitter } from "react-native";

//Add it in componentWillMount or somewhere where it will get executed at the start of app 
DeviceEventEmitter.addListener('ScannerBroadcastReceiver', function (map) {
    console.log('Scanner content is: ' + map.referrer);
});

//Do not forget to remove the listener at componentWillUnmount 
componentWillUnmount() {
    DeviceEventEmitter.removeListener('ScannerBroadcastReceiver'); 
  }


```
  
