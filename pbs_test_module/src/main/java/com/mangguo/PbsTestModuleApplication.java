package com.mangguo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PbsTestModuleApplication implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("test模块起作用了。。。。。。");
        log.error("这个输出了：${}", 1);
        log.info("日志应该输出了的吧");
    }
}
