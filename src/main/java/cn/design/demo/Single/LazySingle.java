package cn.design.demo.Single;

/**
 * @author zhangkun
 * @create 2020-07-03 11:30 AM
 * @desc
 * 为了解决饿汉式单列浪费内存问题，于是出现了懒汉式单列写法。懒汉式单列对象要在使用时候才创建。（反射、序列化可破坏单列）
 *
 * 优点：节约内存空间，延迟加载。
 *
 * 缺点：线程不安全
 *
 **/

public class LazySingle {


    private static LazySingle lazySingle=null;

    private LazySingle() {
    }

    public static LazySingle getInstance(){
        if(null==lazySingle){
             lazySingle=new LazySingle();
        }
        return lazySingle;
    }





}
