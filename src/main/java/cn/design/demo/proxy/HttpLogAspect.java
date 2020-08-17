package cn.design.demo.proxy;

import com.alibaba.fastjson.JSON;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;



/**
 * @author zhangkun
 * @create 2020-07-31 2:57 PM
 * @desc
 **/
@Aspect
@Component
public class HttpLogAspect {



     private Logger logger = LoggerFactory.getLogger(HttpLogAspect.class);

     ThreadLocal<Long> threadLocal = new ThreadLocal();

     @Pointcut("execution(public * cn.design.demo.controller..*.*())")
     public void httpLog(){}



     @Before("httpLog()")
     public void runBeFore(JoinPoint joinPoint){
         threadLocal.set(System.currentTimeMillis());
         System.out.println("访问开始之前操作");
         ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
         HttpServletRequest request = attributes.getRequest();
         logger.info("URL : {}", request.getRequestURL()+" ["+request.getMethod()+"]");
         logger.info("IP : {}", request.getRemoteAddr());
         Enumeration<String> headerNames = request.getHeaderNames();
         while(headerNames.hasMoreElements()) {
             String nextElement = headerNames.nextElement();
             logger.info(nextElement.toUpperCase() + " : {}", request.getHeader(nextElement));
         }
         logger.info("CLASS_METHOD : {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

         logger.info("PARAM : {}", null != request.getQueryString() ? JSON.toJSONString(request.getQueryString().split("&")) : "EMPTY");
     }

//    @After(value = "execution(public * cn.design.demo.controller..*.*())")
//    public void runAfterReturning1(Object response) {
//        logger.info("RESPONSE1 : {}", JSON.toJSONString(response));
//        logger.info("SPEND TIME 1: {}", (System.currentTimeMillis() - threadLocal.get()) + "ms");
//    }


//     @AfterReturning(returning = "response",pointcut = "httpLog()")
//     public void runAfterReturning(Object response) {
//         logger.info("RESPONSE : {}", JSON.toJSONString(response));
//         logger.info("SPEND TIME : {}", (System.currentTimeMillis() - threadLocal.get()) + "ms");
//     }









}
