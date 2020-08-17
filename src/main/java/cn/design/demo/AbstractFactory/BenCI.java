package cn.design.demo.AbstractFactory;

/**
 * @author zhangkun
 * @create 2020-07-03 10:11 AM
 * @desc 产品一
 **/

public class BenCI implements Car {


    @Override
    public void productCar() {
        System.out.println("生成奔驰汽车");
    }
}
