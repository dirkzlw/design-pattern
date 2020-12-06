package com.dirk.learn.c.abstractfactory;

/**
 * @author Dirk
 * @date 2020-12-06 17:39
 * @description
 */
public class ProductFacotry_01 implements AbstractFactory {
    @Override
    public AbstractProduceA creataProductA() {
        return new ProductA_01();
    }

    @Override
    public AbstractProduceB creataProductB() {
        // 省略
        return null;
    }
}
