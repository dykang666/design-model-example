package com.example.designmodel.example.decorate;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 装饰者模式（Decorator Pattern）
 * 装饰者模式 是一种结构型设计模式，允许在不改变对象结构的情况下，动态地添加额外的功能。
 * 装饰者模式通过将对象的功能和行为包装在装饰者中，提供了一种比继承更灵活的方式来扩展对象功能。
 * 它符合 开闭原则（对扩展开放，对修改封闭），是处理类功能扩展和组合的一种常见且高效的方式。
 *
 *
 * @date 2024/5/24 12:53
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小王");
        System.out.println("第一种装扮");
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        tShirts.Decorate(person);
        //装饰者模式
        bigTrouser.Decorate(tShirts);
        bigTrouser.Show();

    }

}
