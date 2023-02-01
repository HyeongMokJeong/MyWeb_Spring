package com.Myweb.hanbat.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class PerformanceAspect extends com.Myweb.hanbat.aop.DefaultAspect {
    @Pointcut("@annotation(com.Myweb.hanbat.annotation.RunningTime)")
    private void enableRunningTime() {}

    @Pointcut("execution(* com.Myweb.hanbat.*.*(..))")
    private void cut() {}

    @Around("cut() && enableRunningTime()")
    public void loggingRunningTime(ProceedingJoinPoint joinPoint) throws Throwable { // 대상을 실행까지 할 수 있는 joinPoint
        // 메소드 수행 전, 측정 시작
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // 메소드 수행
        Object returningObj = joinPoint.proceed();

        // 메소드 수행 후, 측정 종료 및 로깅
        stopWatch.stop();
        log.info("{}의 총 수행 시간 => {} sec", getMethodName(joinPoint), stopWatch.getTotalTimeSeconds());
    }
}
