package cn.design.demo.Decorator;

/**
 * @author zhangkun
 * @create 2020-08-12 5:46 PM
 * @desc 具体构件（ConcreteComponent）：定义一个将要接收附加责任的类
 **/

public class ConcreteComponent implements Component {
    @Override
    public void sampleOperation() {
        //相关业务代码

        System.out.println("玩游戏");
    }
}
