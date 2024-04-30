#import "RTNDeviceinfo.h"
#import <sys/utsname.h>

@implementation RTNDeviceinfo

RCT_EXPORT_MODULE()

#ifdef RCT_NEW_ARCH_ENABLED
-(void)getDeviceModel:(RCTPromiseResolveBlock)resolve reject:(RCTPromiseRejectBlock)reject {
    struct utsname systemInfo;
    uname(&systemInfo);
    // return [NSString stringWithCString:systemInfo.machine encoding:NSUTF8StringEncoding];
    resolve([NSString stringWithCString:systemInfo.machine encoding:NSUTF8StringEncoding]);
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeRtnDeviceinfoSpecJSI>(params);
}
#endif

@end