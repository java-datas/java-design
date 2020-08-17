package cn.design.demo.Builder;

/**
 * @author zhangkun
 * @create 2020-07-04 3:54 PM
 * @desc 建造者
 **/

public abstract class Builder {
    //汉堡
    abstract Builder bulidA(String mes);
    //饮料
    abstract Builder bulidB(String mes);
    //薯条
    abstract Builder bulidC(String mes);
    //甜品
    abstract Builder bulidD(String mes);
    //获取套餐
    abstract Product build();
}
