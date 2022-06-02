package com.test.myapplication;

import android.app.Application;

import androidx.annotation.Nullable;

import com.apm.applog.AppLog;
import com.apm.insight.MonitorCrash;
import com.apm.insight.log.VLog;
import com.bytedance.apm.insight.ApmInsight;
import com.bytedance.apm.insight.ApmInsightInitConfig;
import com.bytedance.apm.insight.IDynamicParams;

import java.util.HashMap;
import java.util.Map;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        MonitorCrash crash = MonitorCrash.init(this,"164314",  BuildConfig.VERSION_CODE,  BuildConfig.VERSION_NAME);

        crash.config().setChannel("channel");

        crash.config().setDeviceId("113468f0-ccf7-3405-a010-da45c8296144");

//
//        ApmInsightInitConfig.Builder builder = ApmInsightInitConfig.builder();
////设置分配的appid
//        builder.aid("164314");
////是否开启卡顿功能
//        builder.blockDetect(true);
////是否开启严重卡顿功能
//        builder.seriousBlockDetect(true);
////是否开启流畅性和丢帧
//        builder.fpsMonitor(true);
////控制是否打开WebVeiw监控
////        builder.enableWebViewMonitor(true);
////控制是否打开内存监控
//        builder.memoryMonitor(true);
////控制是否打开电量监控
//        builder.batteryMonitor(true);
////控制是否打开CPU监控
//        builder.cpuMonitor(true);
////是否打印日志，注：线上release版本要配置为false
//        builder.debugMode(true);
////默认不需要，私有化部署才需要配置数据上报的域名 （内部有默认域名，测试支持设置http://www.xxx.com  默认是https协议
////builder.defaultReportDomain("www.xxx.com");
////设置渠道。1.3.16版本增加接口
//        builder.channel("google play");
////打开自定义日志回捞能力。1.4.1版本新增接口
//        builder.enableLogRecovery(true);
////设置数据和Rangers Applog数据打通，设备标识did必填。1.3.16版本增加接口
//        builder.setDynamicParams(new IDynamicParams() {
//            @Override
//            public String getUserUniqueID() {
//
//                //可选。依赖AppLog可以通过AppLog.getUserUniqueID()获取，否则可以返回null。
//                return null;
//            }
//
//            @Override
//            public String getAbSdkVersion() {
//                //可选。如果依赖AppLog可以通过AppLog.getAbSdkVersion()获取，否则可以返回null。
//                return null;
//            }
//
//            @Override
//            public String getSsid() {
//                //可选。依赖AppLog可以通过AppLog.getSsid()获取，否则可以返回null。
//                return null;
//            }
//
//            @Override
//            public String getDid() {
//                //1.4.0版本及以上可选，其他版本必填。设备的唯一标识，如果依赖AppLog可以通过 AppLog.getDid() 获取，也可以自己生成。
//                return "113468f0-ccf7-3405-a010-da45c8296144";
//            }
//
//            @Override
//            public String getUserId() {
//                //可选。用户的唯一标识，支持用户自定义user_id把平台数据和自己用户关联起来
//                return "113468f0-ccf7-3405-a010-da45c8296144";
//            }
//
//        });
//        ApmInsight.getInstance().init(this, builder.build());
//初始化自定日志，配置自定义日志最大占用磁盘，内部一般配置20,代表最大20M磁盘占用。1.4.1版本开始存在这个api
        VLog.init(this,20);
    }
}
