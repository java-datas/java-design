package cn.design.demo.observer;

/**
 * @author zhangkun
 * @create 2020-08-17 2:36 PM
 * @desc
 **/

public class ObserverA implements Observer {


    //myState需要跟目标对象的state值保持一致！
    private int myState;


    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
