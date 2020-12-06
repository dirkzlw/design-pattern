package com.dirk.learn.c.abstractfactory;

/**
 * @author Dirk
 * @date 2020-12-06 17:36
 * @description
 */
public class ProductA_01 extends AbstractProduceA{
    @Override
    public void custRealize() {
        System.out.println("产品A的具体实现01");
    }
}
