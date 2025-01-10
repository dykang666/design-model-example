package com.example.designmodel.example.observe;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 观察者模式
 * 观察者模式通过一对多的关系，使得一个对象的状态变化能够通知到多个相关对象，
 * 常用于事件驱动、通知系统和模型-视图控制器（MVC）设计模式中。
 * @date 2024/5/28 15:31
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
       // System.out.println("Second state change: 10");
      //  subject.setState(10);
    }
}
