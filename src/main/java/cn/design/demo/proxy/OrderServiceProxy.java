package cn.design.demo.proxy;

/**
 * @author zhangkun
 * @create 2020-07-30 3:04 PM
 * @desc 代理类
 **/

public class OrderServiceProxy implements OrderService {


    private OrderService proxyOrderSerice;

    public OrderServiceProxy(OrderService proxyOrderSerice) {
        this.proxyOrderSerice = proxyOrderSerice;
    }

    @Override
    public void order() {
        System.out.println("日子搜集开始。。。。");
        proxyOrderSerice.order();
        System.out.println("日子搜集结束。。。。");
    }
}
