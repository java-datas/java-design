package cn.design.demo.Builder;

/**
 * @author zhangkun
 * @create 2020-07-04 3:56 PM
 * @desc  具体建造者(服务员)
 **/

public class ConcreteBuilder extends Builder {
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    Product build() {
        return product;
    }

    @Override
    Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
}
