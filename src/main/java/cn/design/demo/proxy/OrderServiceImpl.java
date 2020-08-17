package cn.design.demo.proxy;

/**
 * @author zhangkun
 * @create 2020-07-30 3:02 PM
 * @desc
 **/

public class OrderServiceImpl implements OrderService {


    @Override
    public void order() {
        System.out.println("用户下单操作。。。。。");
    }
}
