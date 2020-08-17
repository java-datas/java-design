package cn.design.demo.AbstractFactory;

/**
 * @author zhangkun
 * @create 2020-07-03 10:32 AM
 * @desc
 **/

public class ConCreateFactory2 implements AbstractFactory {


    @Override
    public Car getInstance1() {

        System.out.println("具体工厂 2 生成-->具体保时捷 汽车...");
        return new Porsche();
    }

    @Override
    public Plance getInstance2() {
        System.out.println("具体工厂 2 生成-->具体生成民用 飞机...");
        return new CivilPlance();
    }
}
