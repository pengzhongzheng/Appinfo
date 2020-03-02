package com.peng.log;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Auther lovely
 * @Create 2020-02-09 8:52
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Aspect
public class ServiceLog {

    private Logger log = Logger.getLogger(ServiceLog.class);

    @Pointcut(value = "execution(* com.peng.service.developer.*(..))")
    public void servicePointcut(){ }

    @Before("servicePointcut()")
    public void before(JoinPoint joinPoint){
        log.info("调用"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()+"方法入参:"+ Arrays.toString(joinPoint.getArgs()));
    }

    @Around("servicePointcut()")
    public Object afterAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName() + "方法。方法入参" + Arrays.toString(joinPoint.getArgs()));
        try{
            Object result = joinPoint.proceed();
            log.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName() + "方法。方法返回值 = " + result);
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw throwable;
        }finally {
            log.info(joinPoint.getSignature().getName() + " 方法结束执行");
        }
    }
}
