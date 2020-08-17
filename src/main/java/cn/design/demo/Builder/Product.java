package cn.design.demo.Builder;

/**
 * @author zhangkun
 * @create 2020-07-04 3:54 PM
 * @desc Prouduct 产品
 **/

public class Product {

    private String buildA="汉堡";
    private String buildB="饮料";
    private String buildC="薯条";
    private String buildD="甜品";

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return buildA+"\n"+buildB+"\n"+buildC+"\n"+buildD+"\n"+"组成套餐";
    }
}
