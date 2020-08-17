package cn.design.demo.Single;

/**
 * @author zhangkun
 * @create 2020-07-04 2:22 PM
 * @desc 单个 加锁模式
 *
 *  线程安全，线程安全，延迟加载
 *  当线程数量较大的情况下,CPU分配压力会上升，导致大批线程阻塞，从而导致程序性能大幅度下降。
 *  方法同步，调用效率低，消耗cpu高
 **/

public class LockSingle {

    private static LockSingle lockSingle;

    private LockSingle() {
    }

    public synchronized static LockSingle getInstance(){
        if(lockSingle==null){
            lockSingle=new LockSingle();
        } return lockSingle;
    }
}
