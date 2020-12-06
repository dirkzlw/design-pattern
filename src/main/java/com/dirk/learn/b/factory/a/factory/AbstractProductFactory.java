package com.dirk.learn.b.factory.a.factory;

/**
 * @author Dirk
 * @date 2020-11-21 10:13
 * @description 抽象工厂类
 */
public abstract class AbstractProductFactory {

    /**
     * 获取产品
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends AbstractProduct> T getProduct(Class<T> clazz) throws Exception;

}
