package com.mangguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by weijiuzhu on 2020/6/4.
 */
@SpringBootApplication
public class PbsTestModule {
    public static void main(String[] args) {
        SpringApplication.run(PbsTestModule.class, args);
        System.out.println("------ spring boot start ------");
    }
}
