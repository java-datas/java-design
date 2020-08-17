package cn.design.demo.observer;

/**
 * @author zhangkun
 * @create 2020-08-17 2:31 PM
 * @desc 目标对象(主体对象 topic)
 **/

public class ConcreteSubject implements Subject<Observer> {


    private int state;

    public void setState(int state) {
        this.state = state;
        this.notifyAllObServer();
    }

    public int getState() {
        return state;
    }

    @Override
    public void registerObServer(Observer obs) {
        // TODO Auto-generated method stub
        list.add(obs);
    }

    @Override
    public void removeObServer(Observer obs) {
        // TODO Auto-generated method stub
        list.remove(obs);
    }

    @Override
    public void notifyAllObServer() {
        for (Observer obs : list) {
            //更新每一个观察者的信息
            obs.update(this);
        }
    }
}
