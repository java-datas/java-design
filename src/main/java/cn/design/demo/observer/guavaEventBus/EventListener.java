package cn.design.demo.observer.guavaEventBus;

/**
 * @author zhangkun
 * @create 2020-08-17 3:01 PM
 * @desc
 **/

public interface EventListener<T> {

    public void event1(CustomEvent event);


}
