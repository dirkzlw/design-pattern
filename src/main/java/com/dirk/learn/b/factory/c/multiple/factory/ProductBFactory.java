package com.dirk.learn.b.factory.c.multiple.factory;

import com.dirk.learn.b.factory.a.factory.AbstractProduct;
import com.dirk.learn.b.factory.a.factory.ProductB;

/**
 * @author Dirk
 * @date 2020-11-21 10:46
 * @description
 */
public class ProductBFactory extends AbstractProductFactory {
    @Override
    public <T extends AbstractProduct> T getProduct() {
        return (T) new ProductB();
    }
}
