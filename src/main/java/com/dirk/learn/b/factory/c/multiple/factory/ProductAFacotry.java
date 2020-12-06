package com.dirk.learn.b.factory.c.multiple.factory;

import com.dirk.learn.b.factory.a.factory.AbstractProduct;
import com.dirk.learn.b.factory.a.factory.ProductA;

/**
 * @author Dirk
 * @date 2020-11-21 10:45
 * @description 产品01的工厂
 */
public class ProductAFacotry extends AbstractProductFactory {

    @Override
    public <T extends AbstractProduct> T getProduct() {
        return (T) new ProductA();
    }
}
