package com.dirk.learn.b.factory.c.multiple.factory;

import com.dirk.learn.b.factory.a.factory.AbstractProduct;

/**
 * @author Dirk
 * @date 2020-11-21 10:44
 * @description 多个工厂，每个工厂生产对应的产品
 */
public class Client {

    public static void main(String[] args) {
        AbstractProductFactory productFactory = new Product_01Facotry();
        AbstractProduct product = productFactory.getProduct();
        product.setName("老茅台");
        product.defaultRealize();
        product.custRealize();
    }

}
