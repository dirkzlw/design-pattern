package com.dirk.learn.a_singleton_pattern.a_hungry;

/**
 * @author Dirk
 * @date 2020-11-21 9:35
 * @description
 */
public class Singleton {

    private final static Singleton SINGLETON = new Singleton();

    /**
     * 限制客户端创建其他实例
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }

    public void realize() {
        System.out.println("这是饿汉式单例模型" + SINGLETON);
    }
}
