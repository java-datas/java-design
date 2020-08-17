package cn.design.demo.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zhangkun
 * @create 2020-08-17 2:26 PM
 * @desc 观察者模式：目标对象模板
 **/

public interface Subject<T> {


    // 存储订阅者
    List<Observer> list = Lists.newArrayList();

    //注册订阅者
    public void registerObServer(T obs);

    //移除订阅者
    public void removeObServer(T obs);

    // 通知所有的观察者更新状态
    public void notifyAllObServer();


}
