package cn.design.demo.Single;

import org.junit.Test;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangkun
 * @create 2020-07-03 11:27 AM
 * @desc
 **/

public class TestSingle {

    ExecutorService executor = Executors.newFixedThreadPool(20);
    /**
     * 模拟并发线程
     */
    CyclicBarrier barrier = new CyclicBarrier(20);


    @Test
    public void test2() {
        for (int i = 0; i < 20; i++) {
            executor.submit(new thread1(barrier, "线程" + i));
        }
        executor.shutdown();
    }


    class thread1 implements Runnable {

        private String threadName;

        private CyclicBarrier cyclicBarrier;

        public thread1(CyclicBarrier barrier, String threadName) {
            super();
            this.cyclicBarrier = barrier;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            try {
                System.out.println(threadName + " 准备好了...");
                cyclicBarrier.await();
//                HungerSingle instance = HungerSingle.getInstance();
//                LazySingle instance = LazySingle.getInstance();
//                InnerSingle instance = InnerSingle.getInstance();
//                LazySingle instance = LazySingle.getInstance();
//                DoubleLockSingle instance = DoubleLockSingle.getInstance();
                EnumSingle instance = EnumSingle.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
