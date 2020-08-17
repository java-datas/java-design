package cn.design.demo.SimpleFactory.Factory;

import cn.design.demo.SimpleFactory.Book;

/**
 * @author zhangkun
 * @create 2020-06-20 6:06 PM
 * @desc 工厂模式
 **/

public interface Factory {

    public Book getInstance();
}
