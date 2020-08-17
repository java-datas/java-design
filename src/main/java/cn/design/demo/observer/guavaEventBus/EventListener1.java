package cn.design.demo.observer.guavaEventBus;

import com.google.common.eventbus.Subscribe;

import java.time.Instant;

/**
 * @author zhangkun
 * @create 2020-08-17 3:00 PM
 * @desc
 **/

public class EventListener1 implements EventListener {


    @Subscribe
    public void event1(CustomEvent event) {
        System.out.println(Instant.now() + "监听者1-->订阅者1,收到事件：" + event.getAge() + ", 线程号：" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Subscribe
    public void event2(CustomEvent event) {
        System.out.println(Instant.now() + "监听者1-->订阅者2,收到事件：" + event.getAge() + ", 线程号：" + Thread.currentThread().getName());
    }


}
