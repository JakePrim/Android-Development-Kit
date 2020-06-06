package com.prim.alibrary.log;

/**
 * @author prim
 * @version 1.0.0
 * @desc 日志信息配置类
 * @time 2020/5/31 - 4:47 PM
 * @contact https://jakeprim.cn
 * @name AKitDemo
 */
public abstract class ALogConfig {
    public String getGlobalTag() {
        return "ALog";
    }

    public boolean enable() {
        return true;
    }
}
