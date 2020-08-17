package cn.design.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangkun
 * @create 2020-07-30 7:57 PM
 * @desc JDK 动态代理类
 *
 * JDK的动态代理使用Java的反射技术生成动态代理类，只能代理实现了接口的类， 没有实现接口的类不能实现动态代理。
 *
 **/

public class JdkInvocationHandler implements InvocationHandler {

    /**
     * 目标代理对象
     */
    public Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>日志收集开始>>>>"); //代理开始前
        // 执行代理对象方法
        Object reuslt = method.invoke(target, args);
        System.out.println(">>>日志收集结束>>>>");// 代理开始后
        return reuslt;
    }

    public  <T> T getProxy(){

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),  this);
    }



}

