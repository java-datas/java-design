package cn.design.demo.AbstractFactory;

/**
 * @author zhangkun
 * @create 2020-07-03 10:30 AM
 * @desc
 **/

public class CivilPlance implements Plance {


    @Override
    public void createPlance() {
        System.out.println("生成民用飞机");
    }
}
