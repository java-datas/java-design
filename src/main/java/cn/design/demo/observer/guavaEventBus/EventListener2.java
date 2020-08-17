package cn.design.demo.observer.guavaEventBus;

import com.google.common.eventbus.Subscribe;

import java.time.Instant;

/**
 * @author zhangkun
 * @create 2020-08-17 3:14 PM
 * @desc
 **/

public class EventListener2 {

    @Subscribe
    public void test(CustomEvent event) {
        System.out.println(Instant.now() + ",监听者2,收到事件：" + event.getAge() + "，线程号为：" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}