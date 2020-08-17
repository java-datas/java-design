package cn.design.demo.Delegate;

/**
 * @author zhangkun
 * @create 2020-08-13 4:48 PM
 * @desc
 **/

public class Printer {

    public void printer(){
        RealPrinter p = new RealPrinter(); // 委派
        p.print();


    }




}
