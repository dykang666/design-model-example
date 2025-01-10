package com.example.designmodel.example.factory.reflect.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  简单的工厂方法模式，通过反射来创建对象
 * @date 2024/5/24 14:37
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        calcul(23, 43, "Sub");
    }
    public static void calcul(double arg0,double arg1,String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        double result = 0;
        // 根据产品类型通过反射动态加载类并创建对象
        Class<?> clazz = Class.forName("com.example.learn.designmodel.example.factory.reflect.demo2." + type);
        Calcul cal = (Calcul)clazz.newInstance();
        result = cal.getResult(arg0, arg1);
        System.out.println(result);
    }
}
