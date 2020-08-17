package cn.design.demo.Builder;

/**
 * @author zhangkun
 * @create 2020-07-04 4:00 PM
 * 建造模式
 * @desc Director 导演角色 随意搭配
 **/

public class Test {

    @org.junit.Test
    public void test1(){

        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product build = concreteBuilder
                .bulidA("牛肉煲")
                .bulidC("全家桶")
                .bulidD("冰淇淋").bulidB("可乐")
                .build();
        System.out.println(build.toString());
    }

}
