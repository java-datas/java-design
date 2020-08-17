package cn.design.demo.Single;

/**
 * @author zhangkun
 * @create 2020-07-04 2:27 PM
 * @desc 双重锁 单列
 *
 * 资源利用率高，既能够在需要的时候才初始化实例，又能保证线程安全，同时调用getInstance()方法不进行同步锁，效率高，延迟加载
 *
 * 缺点 上锁对性能还是有一定影响，不过jdk8 对synchronized 做了优化。已经很好了（ 反射、序列化可破坏单列）
 *
 **/

public class DoubleLockSingle {

    private DoubleLockSingle() {
    }

    private static DoubleLockSingle instance = null;

    public static DoubleLockSingle getInstance() {
        // 两层判空，第一层是为了避免不必要的同步
        // 第二层是为了在null的情况下创建实例
        if (instance == null) {
            synchronized (DoubleLockSingle.class) {
                if (instance == null) {
                    instance = new DoubleLockSingle();
                }
            }

        }
        return instance;
    }

}
