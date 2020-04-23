package com.lyg.flowermanagement.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PerformanceAspect {
    @Around("accountOps()")
    public Object logPerformance(ProceedingJoinPoint point) throws  Throwable{
        //定义开始时间
        long startTime=System.currentTimeMillis();
        String name="-";
        String result="Y";
        Object obj=null;
        //获取方法的签名 和名称
      try {
          name= point.getSignature().toShortString();
          obj=point.proceed();
      }catch (Throwable e){
          result="N";
          throw e;
      }finally {
          long endTime=System.currentTimeMillis();
          log.info("{};{};{}ms",name,result,endTime-startTime);
      }
        return obj;
    }

    @Pointcut("execution(* com.lyg.flowermanagement.service..*(..))")
    private void accountOps(){};
}
