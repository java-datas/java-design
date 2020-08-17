package cn.design.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangkun
 * @create 2020-07-06 7:38 PM
 * @desc 动态代理
 **/

public class DynamicProxyHandler implements InvocationHandler {

    //代理类中的真实对象
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 真实的对象执行之前 我们可以添加自己的操作
        System.out.println("before invike ...");
        Object invoke = method.invoke(object, args);
        //在真实的对象执行之后我们可以添加自己的操作
        System.out.println("after invoke。。。");
        return invoke;
    }







}
