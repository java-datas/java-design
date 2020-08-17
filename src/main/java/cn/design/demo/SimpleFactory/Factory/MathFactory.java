package cn.design.demo.SimpleFactory.Factory;

import cn.design.demo.SimpleFactory.Book;
import cn.design.demo.SimpleFactory.MathBook;

/**
 * @author zhangkun
 * @create 2020-06-20 6:05 PM
 * @desc
 **/

public class MathFactory implements Factory {
    @Override
    public Book getInstance() {
        return new MathBook();
    }
}
