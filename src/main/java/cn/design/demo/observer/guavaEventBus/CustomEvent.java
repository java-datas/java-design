package cn.design.demo.observer.guavaEventBus;

/**
 * @author zhangkun
 * @create 2020-08-17 2:59 PM
 * @desc 自定义事件类
 **/

public class CustomEvent implements Event {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void handlerEvent() {

    }

    public CustomEvent() {
    }

    public CustomEvent(int age) {
        this.age = age;
    }
}
