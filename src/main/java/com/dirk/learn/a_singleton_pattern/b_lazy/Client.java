package com.dirk.learn.a_singleton_pattern.b_lazy;

/**
 * @author Dirk
 * @date 2020-11-21 9:39
 * @description
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.realize();
        }
    }

}
