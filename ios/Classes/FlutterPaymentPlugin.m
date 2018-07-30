#import "FlutterPaymentPlugin.h"
#import <flutter_payment/flutter_payment-Swift.h>

@implementation FlutterPaymentPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterPaymentPlugin registerWithRegistrar:registrar];
}
@end
