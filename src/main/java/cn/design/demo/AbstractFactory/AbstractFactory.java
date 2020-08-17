package cn.design.demo.AbstractFactory;

/**
 * @author zhangkun
 * @create 2020-07-03 10:09 AM
 * @desc 抽象工厂
 **/

public interface AbstractFactory {

    /**
     * 产品1 汽车实列 实列
     * @return
     */
    public Car getInstance1();

    /**
     * 产品2 飞机实列
     * @return
     */
    public Plance getInstance2();

}
