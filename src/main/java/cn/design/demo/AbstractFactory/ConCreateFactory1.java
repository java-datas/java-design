package cn.design.demo.AbstractFactory;

/**
 * @author zhangkun
 * @create 2020-07-03 10:14 AM
 * @desc
 **/

/**
 * 工厂一
 */
public class ConCreateFactory1 implements AbstractFactory {



    public Car getInstance1() {
        System.out.println("具体工厂 1 生成-->具体奔驰 汽车...");
        return new BenCI();
    }

    @Override
    public Plance getInstance2() {
        System.out.println("具体工厂 1 生成-->具体产品 生成军用飞机");
        return new MilitaryPlance();
    }


}
