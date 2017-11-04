package com.springbook.biz.common;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
public class AfterAdvice {
    public void finallyLog(){
        System.out.println("[사후 처라] After Advice - 메소드 수행 후 무조건 동작");
    }
}
