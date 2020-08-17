package cn.design.demo.SimpleFactory;

import org.junit.Test;

import cn.design.demo.SimpleFactory.Factory.BookFactory;
import cn.design.demo.SimpleFactory.Factory.EnglishFactory;
import cn.design.demo.SimpleFactory.Factory.Factory;
import cn.design.demo.SimpleFactory.Factory.MathFactory;

/**
 * @author zhangkun
 * @create 2020-06-20 5:47 PM
 * @desc
 **/

public class TestBook {


    /**
     * 简单工厂
     */
    @Test
    public void test1() {
        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.getBook("math");
        book.publish();
    }

    /**
     * 工厂方法模式
     */
    @Test
    public void testFactory() {
        Factory factory;
        Book book;
        factory = new MathFactory();
        book = factory.getInstance();
        book.publish();
        factory = new EnglishFactory();
        book = factory.getInstance();
        book.publish();
    }


}
