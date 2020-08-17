package cn.design.demo.AbstractFactory;

/**
 * @author zhangkun
 * @create 2020-07-03 10:29 AM
 * @desc
 **/

public class MilitaryPlance implements Plance {


    @Override
    public void createPlance() {
        System.out.println("生产军用飞机");
    }
}
