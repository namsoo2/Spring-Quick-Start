package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
public class BeforeAdvice {
    public void beforeLog(JoinPoint jp) {
        String method = jp.getSignature().getName();
        Object[] args = jp.getArgs();

        System.out.println("[사전 처라]" + method + "() 메소드 ARGS 정보 :  " + args[0].toString() + "Before Advice");
    }
}
