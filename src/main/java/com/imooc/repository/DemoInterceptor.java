package com.imooc.repository;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Service
public class DemoInterceptor extends HandlerInterceptorAdapter {

    @Scheduled(cron = "0 0 12 * * ?" )
    public void fixTimeRun(){
        System.out.println();
    }


}
