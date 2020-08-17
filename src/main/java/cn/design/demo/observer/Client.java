package cn.design.demo.observer;

/**
 * @author zhangkun
 * @create 2020-08-17 2:41 PM
 * @desc
 **/

public class Client {

    public static void main(String[] args) {

        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA  obs1 = new ObserverA();
        ObserverA  obs2 = new ObserverA();
        ObserverA  obs3 = new ObserverA();

        //将这三个观察者添加到subject对象的观察者队伍中
        subject.registerObServer(obs1);
        subject.registerObServer(obs2);
        subject.registerObServer(obs3);


        //改变subject的状态
        subject.setState(3000);
        System.out.println("########################");
        //我们看看，观察者的状态是不是也发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        //改变subject的状态
        subject.setState(30);
        System.out.println("########################");
        //我们看看，观察者的状态是不是也发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        //改变subject的状态
        subject.setState(99);
        System.out.println("########################");
        //我们看看，观察者的状态是不是也发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }

}
