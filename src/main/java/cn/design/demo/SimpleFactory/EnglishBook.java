package cn.design.demo.SimpleFactory;

/**
 * @author zhangkun
 * @create 2020-06-20 5:39 PM
 * @desc
 **/

public class EnglishBook implements Book {


    @Override
    public void publish() {
        System.out.println("出版英语书");
    }
}
