package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
public class AfterThrowingAdvice {
    public void exceptionLog(JoinPoint jp, Exception exceptionObj) {
        String method = jp.getSignature().getName();

        System.out.println("[예외 처리]" + method + "() 메소드 수행 중 예외 발생");

        if(exceptionObj instanceof IllegalAccessException){
            System.out.println("부적합한 값이 입력되었습니다");
        }else  if(exceptionObj instanceof NumberFormatException){
            System.out.println("숫자 형식의 값이 아닙니다");
        }else  if(exceptionObj instanceof NullPointerException){
            System.out.println("NULL~~~~~예외");
        }else  if(exceptionObj instanceof Exception){
            System.out.println("문제가 발생했습니다");
        }
    }
}
