package com.example.designmodel.example.proxy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 13:47
 */
public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");
        //代理模式
        Proxy proxy = new Proxy(jiaojiao);
        // 送巧克力
        proxy.GiveChocolate();
        //赠娃娃
        proxy.GiveDolls();
        //赠花
        proxy.GiveFlowers();
    }
}
