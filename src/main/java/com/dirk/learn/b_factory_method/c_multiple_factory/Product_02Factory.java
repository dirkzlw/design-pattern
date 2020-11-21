package com.dirk.learn.b_factory_method.c_multiple_factory;

import com.dirk.learn.b_factory_method.a_factory.AbstractProduct;
import com.dirk.learn.b_factory_method.a_factory.Product_02;

/**
 * @author Dirk
 * @date 2020-11-21 10:46
 * @description
 */
public class Product_02Factory extends AbstractProductFactory {
    @Override
    public <T extends AbstractProduct> T getProduct() {
        return (T) new Product_02();
    }
}
