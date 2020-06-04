package com.mangguo.start;

import com.mangguo.service.NettyService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by weijiuzhu on 2020/6/4.
 */
@Slf4j
@Component
public class NettyServerStart implements ApplicationRunner{
    @Resource
    private NettyService nettyService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       // this.startTime();
        nettyService.startNetty();

    }


    public void startTime() throws InterruptedException {
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while (true){
                    Date date = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss", Locale.SIMPLIFIED_CHINESE);
                    Thread.sleep(1000);
                    log.info(Thread.currentThread().getName()+"线程："+format.format(date));
                }
            }
        }).start();


    }
}