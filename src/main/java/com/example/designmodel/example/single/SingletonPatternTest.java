package com.example.designmodel.example.single;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  单例模式
 * 单例模式确保了一个类只有一个实例，并提供全局访问点。
 * 常见的实现方式有：饿汉式、懒汉式、双重检查锁定、静态内部类、枚举等。
 * 单例模式非常适用于需要共享资源的场景，如数据库连接池、日志记录、配置管理等。
 * @date 2024/5/28 15:41
 */
public class SingletonPatternTest {
    public static void main(String[] args) {
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //显示消息
        object.showMessage();
    }
}
