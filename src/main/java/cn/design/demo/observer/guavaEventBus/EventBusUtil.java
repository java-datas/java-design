package cn.design.demo.observer.guavaEventBus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executor;

/**
 * @author zhangkun
 * @create 2020-08-17 3:15 PM
 * @desc 事件总线工具类
 **/

public class EventBusUtil {

    private static Executor executor = new Executor() {
        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    };

    /**
     * 内部类 实现单列模式
     */
    private static class InnerHolder {
        private static final EventBus INNER_SINGLE = new EventBus();
        private static final AsyncEventBus asyncEventBus = new AsyncEventBus(executor);
    }


    public static EventBus getEventBus() {
        return InnerHolder.INNER_SINGLE;
    }

    public static AsyncEventBus getAsynEventBus() {
        return InnerHolder.asyncEventBus;
    }

    // 同步发送事件
    public static void post(Object event) {
        getEventBus().post(event);
    }

    //异步方式发送事件
    public static void asyncPost(Object event) {
        getAsynEventBus().post(event);
    }

    /**
     * 注册订阅者事件
     */
    public static void register(Object object) {
        getEventBus().register(object);
        getAsynEventBus().register(object);
    }

}