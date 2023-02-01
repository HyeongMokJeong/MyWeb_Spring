package com.Myweb.hanbat.aop;

import org.aspectj.lang.JoinPoint;

public class DefaultAspect {
    String getClassName(JoinPoint joinPoint) {
        return joinPoint.getTarget()
                .getClass()
                .getSimpleName();
    }

    String getMethodName(JoinPoint joinPoint) {
        return joinPoint.getSignature()
                .getName();
    }
}
