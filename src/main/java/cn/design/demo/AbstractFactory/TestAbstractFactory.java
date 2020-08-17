package cn.design.demo.AbstractFactory;

import org.junit.Test;

/**
 * @author zhangkun
 * @create 2020-07-03 10:33 AM
 * @desc
 **/

public class TestAbstractFactory {


    @Test
    public void Test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        ConCreateFactory1 conCreateFactory1 = new ConCreateFactory1();
//        Car car = conCreateFactory1.getInstance1();
//        car.productCar();
//
//        ConCreateFactory2 conCreateFactory2 = new ConCreateFactory2();
//        Plance plance = conCreateFactory2.getInstance2();
//        plance.createPlance();

        Class<?> c=Class.forName("cn.design.demo.AbstractFactory.ConCreateFactory2");
        Object o =   c.newInstance();
        ConCreateFactory2 conCreateFactory21 = (ConCreateFactory2) o;
        Car car1 =  conCreateFactory21.getInstance1();
        car1.productCar();
    }


}
