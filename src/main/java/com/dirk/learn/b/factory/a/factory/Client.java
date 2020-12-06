package com.dirk.learn.b.factory.a.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Dirk
 * @date 2020-11-21 10:20
 * @description 工厂方法模式
 */
@Slf4j
public class Client {

    public static void main(String[] args) throws Exception {
        AbstractProductFactory productFactory = new ProductFactory();
        AbstractProduct product;

        try {
            product = productFactory.getProduct(ProductA.class);
            product.setName("红高粱");
            product.defaultRealize();
            product.custRealize();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

}
