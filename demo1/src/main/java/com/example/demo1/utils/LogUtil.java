package com.example.demo1.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.util.StringUtils;

@Slf4j
public class LogUtil {

    // @Slf4j 注解代替
//    private final static Logger log = LoggerFactory.getLogger(LogUtil.class);

    public static void debug(Logger logger, String prefix, String msg, Object... objects) {
        log(Level.DEBUG, logger, prefix, msg, objects);
    }

    public static void info(Logger logger, String prefix, String msg, Object... objects) {
        log(Level.INFO, logger, prefix, msg, objects);
    }

    public static void warn(Logger logger, String prefix, String msg, Object... objects) {
        log(Level.WARN, logger, prefix, msg, objects);
    }

    public static void error(Logger logger, String prefix, String msg, Object... objects) {
        log(Level.ERROR, logger, prefix, msg, objects);
    }

    private static void log( Level level, Logger logger, String prefix, String msg, Object... objects) {
        if (logger == null) {
            logger = log;
        }

        // 设置log前缀
        if (!StringUtils.isEmpty(prefix)) {
            MDC.put("example", prefix);
        }

        if (Level.DEBUG.equals(level)) {
            logger.debug(msg, objects);
        } else if (Level.INFO.equals(level)) {
            logger.info(msg, objects);
        } else if (Level.WARN.equals(level)) {
            logger.warn(msg, objects);
        } else if (Level.ERROR.equals(level)) {
            logger.error(msg, objects);
        }

        // 移除log前缀设置
        MDC.remove("example");
    }
}
