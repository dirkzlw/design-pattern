package com.dirk.learn.a_singleton_pattern.c_expand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Dirk
 * @date 2020-11-21 9:51
 * @description
 */
public class Singleton {

    /**
     * 声明最多实例个数
     */
    private final static Integer maxObj = 4;

    /**
     * 存储实例
     */
    private static List<Singleton> singletons = new ArrayList<>();

    private Singleton() {
    }

    static {
        for (Integer i = 0; i < maxObj; i++) {
            singletons.add(new Singleton());
        }
    }

    public static Singleton getInstance() {
        Random random = new Random();
        return singletons.get(random.nextInt(maxObj));
    }

    public void realize() {
        System.out.println("这是实例集合中第" + (singletons.indexOf(this) + 1) + "个");
    }
}
