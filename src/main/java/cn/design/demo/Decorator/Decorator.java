package cn.design.demo.Decorator;

/**
 * @author zhangkun
 * @create 2020-08-12 5:47 PM
 * @desc 装饰者（Decorator）：持有一个构件（Component）对象的实例，并定义一个与抽象构件接口一致的接口
 **/

public class Decorator  implements Component{

    //抽象构件（Component）
    private Component component;

    //构造函数
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        // 委派给构件
        component.sampleOperation();
    }
}
