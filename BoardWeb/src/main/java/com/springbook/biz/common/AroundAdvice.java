package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
@Service
@Aspect
public class AroundAdvice {

    @Around("PointcutCommon.allPointcut()")
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
        String method = pjp.getSignature().getName();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object returnObj = pjp.proceed();

        stopWatch.stop();
        System.out.println(method+"() 메소드 수행에 걸린 시간 : "+stopWatch.getTotalTimeMillis()+"(ms)초");

//        System.out.println("[Before-Around] 비지니스 메소스 수행 전에 처리할 내용");
//        Object returnObj = pjp.proceed();
//        System.out.println("[After-Around] 비지니스 메소스 수행 후에 처리할 내용");

        return returnObj;
    }
}
