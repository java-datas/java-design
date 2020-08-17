package cn.design.demo.SimpleFactory.Factory;

import cn.design.demo.SimpleFactory.Book;
import cn.design.demo.SimpleFactory.EnglishBook;
import cn.design.demo.SimpleFactory.MathBook;

/**
 * @author zhangkun
 * @create 2020-06-20 5:35 PM
 * @desc 简单工厂模式
 **/

public class BookFactory {

    /**
     * 获取出版图书图书
     * @param s
     */
    public Book getBook(String s){
        Book book = null;
        if(s.endsWith("math")){
            book   =    new MathBook();
        }else if(s.endsWith("english")){
            book =new EnglishBook();
        }
        return book;
    }

}
