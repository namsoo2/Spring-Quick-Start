package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
@Service
@Aspect
public class AfterAdvice {

    @After("PointcutCommon.allPointcut()")
    public void finallyLog(){
        System.out.println("[사후 처라] After Advice - 메소드 수행 후 무조건 동작");
    }
}
