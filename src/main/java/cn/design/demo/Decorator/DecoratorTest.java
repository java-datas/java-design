package cn.design.demo.Decorator;

/**
 * @author zhangkun
 * @create 2020-08-12 5:54 PM
 * @desc
 **/

public class DecoratorTest {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();

        Decorator decorator = new Decorator(new ConcreteDecoratorA(concreteComponent));

        decorator.sampleOperation();

    }
}
