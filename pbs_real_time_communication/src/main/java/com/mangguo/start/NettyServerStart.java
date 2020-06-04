package com.mangguo.start;

import com.mangguo.service.NettyService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by weijiuzhu on 2020/6/4.
 */
@Component
public class NettyServerStart implements ApplicationRunner {
    @Resource
    private NettyService nettyService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        nettyService.startNetty();
    }
}
