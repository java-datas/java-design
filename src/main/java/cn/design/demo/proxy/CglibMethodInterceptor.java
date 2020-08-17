package cn.design.demo.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangkun
 * @create 2020-07-31 10:37 AM
 * @desc
 *
 * 运行时动态的生成一个被代理类的子类（通过ASM字节码处理框架实现），子类重写了被代理类中所有非final的方法，在子类中采用方法拦截的技术拦截所有父类方法的调用，
 * 不需要被代理类对象实现接口，从而CGLIB动态代理效率比Jdk动态代理反射技术效率要高。
 **/

public class CglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println("<<<<<日志收集开始...>>>>>>>");
        Object reuslt = proxy.invokeSuper(o, objects);
        System.out.println("<<<<<日志收集结束...>>>>>>>");
        return reuslt;
    }

}
