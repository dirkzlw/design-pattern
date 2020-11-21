package com.dirk.learn.a_singleton_pattern.b_lazy;

/**
 * @author Dirk
 * @date 2020-11-21 9:35
 * @description 懒汉式单例模型
 */
public class Singleton {

    private static Singleton SINGLETON;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }

    public void realize() {
        System.out.println("这是懒汉式单例模型" + SINGLETON.hashCode());
    }
}
