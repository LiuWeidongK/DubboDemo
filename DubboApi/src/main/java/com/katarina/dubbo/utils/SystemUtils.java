package com.katarina.dubbo.utils;

import org.apache.log4j.Logger;

/**
 * @author : LiuWeidong
 * @date : 2018/9/8
 */
public class SystemUtils {
    private static final Logger LOGGER = Logger.getLogger(SystemUtils.class);

    public static void info(String msg) {
        LOGGER.info(msg);
    }

    public static void error(String msg) {
        LOGGER.error(msg);
    }
}
