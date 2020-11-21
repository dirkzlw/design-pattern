package com.dirk.learn.a_singleton_pattern.a_hungry;

import com.dirk.learn.a_singleton_pattern.b_lazy.Singleton;

/**
 * @author Dirk
 * @date 2020-11-21 9:39
 * @description 饿汉式单例模型
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.realize();
    }

}
