package cn.design.demo.observer.guavaEventBus;

import java.time.Instant;

/**
 * @author zhangkun
 * @create 2020-08-17 3:32 PM
 * @desc
 **/

public class TestEventBus {

    public static void main(String[] args) {
        EventListener1 listener1 = new EventListener1();
        EventListener2 listener2 = new EventListener2();
        CustomEvent customEvent = new CustomEvent(28);
        EventBusUtil.register(listener1);
        EventBusUtil.register(listener2);
       EventBusUtil.post(customEvent);
        EventBusUtil.asyncPost(customEvent);
        System.out.println(Instant.now() +",主线程执行完毕："+Thread.currentThread().getName());
    }

}
