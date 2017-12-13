package com.luli.myfastframe.utils;
import com.luli.myfastframe.base.AppConfig;
import com.luli.myfastframe.base.Constants;
import com.orhanobut.logger.Logger;

/**
 * 日志工具类
 * Created by luli
 */
public class LogUtil {

    /**
     * 打印网络请求日志
     */
    static public void request(String str) {
        if (AppConfig.debugFlag) {
            Logger.i(Constants.logRequest, str);
        }
    }

    /**
     * 打印网络返回日志
     */
    static public void response(String str) {
        if (AppConfig.debugFlag)
            Logger.i(Constants.logResponse, str);
    }

    /**
     * 打印个性化日志
     */
    static public void logPersonalDebug(String name, String str) {
        if (AppConfig.debugFlag)
            Logger.i(name, str);
    }

    /**
     * 打印一般调试日志
     */
    static public void logDebug(String str) {
        if (AppConfig.debugFlag)
            Logger.i(Constants.logDebug, str);
    }


    /**
     * 打印错误日志
     */
    static public void logError(String str) {

        if (AppConfig.debugFlag) {
            Logger.e(Constants.logError, str);
        }
    }


}
