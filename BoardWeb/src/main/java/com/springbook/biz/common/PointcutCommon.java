package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
@Aspect
public class PointcutCommon {
    @Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
    public void allPointcut(){}

    @Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
    public void getPointcut(){}


}
