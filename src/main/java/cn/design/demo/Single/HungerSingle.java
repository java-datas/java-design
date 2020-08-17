package cn.design.demo.Single;

/**
 * @author zhangkun
 * @create 2020-07-03 11:25 AM
 * @desc 饿汉式单列模式
 * 饿汉式单列在类加载的时候就立即初始化，并且创建单列对象。它绝对线程安全，在线程还没出现之前就实例化了，不可能存在访问安全问题。（反射、序列化可破坏单列）
 * 优点：线程安全，执行效率高
 *
 * 缺点：占用空间浪费内存。
 *
 **/

public class HungerSingle {

    private static final HungerSingle hungerSingle = new HungerSingle();

    //单列模式构造方法必须私有化
    private HungerSingle() {
    }

    public static HungerSingle getInstance(){
        return hungerSingle;
    }

}
