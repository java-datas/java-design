package cn.design.demo.SimpleFactory;

/**
 * @author zhangkun
 * @create 2020-06-20 5:37 PM
 * @desc
 **/

public class MathBook implements Book {

    @Override
    public void publish() {
        System.out.println("出版数学书");
    }
}
