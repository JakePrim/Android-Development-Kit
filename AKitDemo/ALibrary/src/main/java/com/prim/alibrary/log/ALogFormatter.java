package com.prim.alibrary.log;

/**
 * @author prim
 * @version 1.0.0
 * @desc 格式化log接口
 * @time 2020/6/1 - 8:12 PM
 * @contact https://jakeprim.cn
 * @name AKitDemo
 */
public interface ALogFormatter<T> {
    /**
     * 格式化方法
     *
     * @param t
     * @return
     */
    String format(T t);
}
