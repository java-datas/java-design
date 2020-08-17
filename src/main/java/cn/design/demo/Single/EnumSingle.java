package cn.design.demo.Single;

/**
 * @author zhangkun
 * @create 2020-07-04 3:02 PM
 * @desc 枚举实现单列
 *
 * 解决 序列化 问题  任何一个readObject方法，不管是显式的还是默认的，它都会返回一个新建的实例，这个新建的实例不同于该类初始化时创建的实例。”当然，这个问题也是可以解决的，
 * 想详细了解的同学可以翻看《effective java》第77条：对于实例控制，枚举类型优于readResolve
 **/

public class EnumSingle {

    /**
     *
     */
    enum single {
        INSTANCE;
        private EnumSingle instance;

        single() {
            instance = new EnumSingle();
        }

        public EnumSingle getInstance() {
            return instance;
        }
    }

    public static EnumSingle getInstance(){
        return single.INSTANCE.getInstance();
    }

}
