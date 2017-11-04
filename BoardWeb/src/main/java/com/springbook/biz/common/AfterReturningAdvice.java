package com.springbook.biz.common;

import com.springbook.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * Created by Namsoo on 2017. 11. 4..
 */
@Service
@Aspect
public class AfterReturningAdvice {


    //returnObj 바인딩 필수
    @AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
    public void afterLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();
        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            if (user.getRole().equals("Admin")) {
                System.out.println(user.getName() + " 로그인(Admin)");
            }
        }

        System.out.println("[사후 처라] After-Returning Advice - 성공적으로 반환");
    }
}
