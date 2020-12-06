package com.dirk.learn.b.factory.c.multiple.factory;

import com.dirk.learn.b.factory.a.factory.AbstractProduct;
import com.dirk.learn.b.factory.a.factory.Product_01;

/**
 * @author Dirk
 * @date 2020-11-21 10:45
 * @description 产品01的工厂
 */
public class Product_01Facotry extends AbstractProductFactory {

    @Override
    public <T extends AbstractProduct> T getProduct() {
        return (T) new Product_01();
    }
}
