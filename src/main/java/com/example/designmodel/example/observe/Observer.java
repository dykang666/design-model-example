package com.example.designmodel.example.observe;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 15:28
 */
public abstract   class Observer {
    protected Subject subject;
    public abstract void update();
}
