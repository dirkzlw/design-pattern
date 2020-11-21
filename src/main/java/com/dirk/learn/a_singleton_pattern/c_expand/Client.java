package com.dirk.learn.a_singleton_pattern.c_expand;

/**
 * @author Dirk
 * @date 2020-11-21 9:51
 * @description 单例模型拓展
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.realize();
        }
    }

}
