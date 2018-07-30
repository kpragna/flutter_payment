package com.purnatva.flutterpayment;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** FlutterPaymentPlugin */
public class FlutterPaymentPlugin implements MethodCallHandler {
  /** Plugin registration. */
  private final MethodChannel channel;
  private Activity activity;

  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "flutter_payment");
    channel.setMethodCallHandler(new FlutterPaymentPlugin(registrar.activity(), channel));
  }

  private FlutterPaymentPlugin(Activity activity, MethodChannel channel) {
    this.activity = activity;
    this.channel= channel;
    this.channel.setMethodCallHandler(this);
  }
  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    }
    else if (call.method.equals("getPayUMoney")) {
//      Intent helloWorldIntent = new Intent(activity, HelloWorld.class);
//      activity.startActivity(helloWorldIntent);
      Toast.makeText(activity, "HelloWorld",  Toast.LENGTH_SHORT).show();
    }
    else {
      result.notImplemented();
    }
  }
}
