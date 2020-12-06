package com.dirk.learn.b.factory.a.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Dirk
 * @date 2020-11-21 10:20
 * @description
 */
@Slf4j
public class Client {

    public static void main(String[] args) throws Exception {
        AbstractProductFactory productFactory = new ProductFacotry();
        AbstractProduct product;

        try {
            product = productFactory.getProduct(Product_01.class);
            product.setName("红高粱");
            product.defaultRealize();
            product.custRealize();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

}
