package cn.design.demo.SimpleFactory.Factory;

import cn.design.demo.SimpleFactory.Book;
import cn.design.demo.SimpleFactory.EnglishBook;

/**
 * @author zhangkun
 * @create 2020-06-20 6:09 PM
 * @desc
 **/

public class EnglishFactory implements Factory {
    @Override
    public Book getInstance() {
        return new EnglishBook();
    }
}
