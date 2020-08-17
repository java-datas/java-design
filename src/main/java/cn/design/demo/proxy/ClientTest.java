package cn.design.demo.proxy;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author zhangkun
 * @create 2020-07-30 3:06 PM
 * @desc
 **/

public class ClientTest {

    public static void main(String[] args) {
//        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
//        orderService.order();


//        OrderService orderService = new OrderServiceProxy1();
//        orderService.order();

//        boolean flag =    "selectPlaceVisitTimeData".startsWith("select");
//        System.out.println(flag);

//
//        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());//代理的真实对象类
//        OrderService proxy = jdkInvocationHandler.getProxy();//获取代理对象
//        proxy.order();//执行操作


//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        // 设置代理类父类
        enhancer.setSuperclass(OrderServiceImpl.class);
        // 设置回调对象
        enhancer.setCallback(cglibMethodInterceptor);
        // 创建代理对象
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();

    }
}
