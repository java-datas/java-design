package cn.design.demo.proxy;

/**
 * @author zhangkun
 * @create 2020-07-30 3:11 PM
 * @desc  接口继承方式实现
 **/

public class OrderServiceProxy1 extends OrderServiceImpl{

    public void order() {
        System.out.println("日志收集开始..");
        super.order();
        System.out.println("日志收集结束..");
    }


}
