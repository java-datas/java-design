package cn.design.demo.Single;

/**
 * @author zhangkun
 * @create 2020-07-04 2:34 PM
 * @desc 内部类单列模式 默认会先初始化内部内,如果没使用内部内不会加载 使用静态内部内方法：解决了内存浪费问题和synchronized性能问题（反射、序列化可破坏单列）
 **/

public class InnerSingle {

    public InnerSingle() { //解决反射破坏单列
        if (InnerHolder.INNER_SINGLE != null) {
            throw new RuntimeException("不允许反射创建");
        }
    }

    public static final InnerSingle getInstance() {
        return InnerHolder.INNER_SINGLE;
    }

    private static class InnerHolder {
        private static final InnerSingle INNER_SINGLE = new InnerSingle();
    }

    //解决序列化破坏单列
    //具体原因查看：java.io.ObjectInputStream#readObject方法源码
    private Object readResolve(){
        return InnerSingle.getInstance();
    }


}
