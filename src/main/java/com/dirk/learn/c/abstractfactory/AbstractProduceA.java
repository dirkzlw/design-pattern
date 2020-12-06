package com.dirk.learn.c.abstractfactory;

/**
 * @author Dirk
 * @date 2020-12-06 17:32
 * @description
 */
public abstract class AbstractProduceA{

    public void defaultRealize() {
        System.out.println("抽象产品A的默认实现");
    }

    /**
     * 自定义实现，由子类完成
     */
    public abstract void custRealize();

}
