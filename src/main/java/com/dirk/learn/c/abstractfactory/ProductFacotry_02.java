package com.dirk.learn.c.abstractfactory;

/**
 * @author Dirk
 * @date 2020-12-06 17:39
 * @description
 */
public class ProductFacotry_02 implements AbstractFactory {
    @Override
    public AbstractProduceA creataProductA() {
        return new ProductA_02();
    }

    @Override
    public AbstractProduceB creataProductB() {
        // 未写上产品B，省略
        return null;
    }
}
