package cn.design.demo.Decorator;

/**
 * @author zhangkun
 * @create 2020-08-12 5:49 PM
 * @desc 具体装饰者 负责给构件对象加上附加的责任
 **/

public class ConcreteDecoratorA  extends Decorator{


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        System.out.println("看电视");
        super.sampleOperation();
    }
}
