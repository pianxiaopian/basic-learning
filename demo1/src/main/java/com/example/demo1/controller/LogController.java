package com.example.demo1.controller;

import com.example.demo1.utils.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

    private final static Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/test")
    public String testLog() {
        logger.debug("=====测试日志debug级别打印====");
        logger.info("======测试日志info级别打印=====");
        logger.error("=====测试日志error级别打印====");
        logger.warn("======测试日志warn级别打印=====");

        // 使用占位符
        String str1 = "github.com/pianxiaopian";
        String str2 = "aiden";
        logger.info("{} git repository: {}", str2, str1);

        // 测试自定义log
        LogUtil.info(logger, "LogController", "{}, how are you ~", str2);

        return "success";
    }
}
