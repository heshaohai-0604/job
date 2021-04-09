package org.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 17:00
 * @Description: //TODO
 */
@Slf4j
public class User {
    /**
     * @Author hsh
     * @Date 10:41 2021/4/9
     * @Param
     * @return
     * @Description //TODO 前置增强
     **/
    public void before(JoinPoint joinPoint){
        log.info("调用" +joinPoint.getTarget().getClass().getTypeName() + "的" +joinPoint.getSignature().getName() +"方法");
    }

    /**
     * @Author hsh
     * @Date 10:48 2021/4/9
     * @Param
     * @return
     * @Description //TODO 后置增强
     **/
    public void after(JoinPoint joinPoint){
        log.info("调用" + joinPoint.getTarget().getClass().getTypeName() + "的" +joinPoint.getSignature().getName()+"方法");
    }
}
