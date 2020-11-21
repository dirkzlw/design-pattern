package com.dirk.learn.b_factory_method.b_simple_factory;

import com.dirk.learn.b_factory_method.a_factory.AbstractProduct;
import com.dirk.learn.b_factory_method.a_factory.Product_02;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Dirk
 * @date 2020-11-21 10:30
 * @description 简单工厂模式，只有一个工厂时，可去掉抽象工厂，用静态工厂
 */
@Slf4j
public class Client {

    public static void main(String[] args) throws Exception {
        AbstractProduct product;
        try {
            product = SimpleFactory.getProduct(Product_02.class);
            product.setName("简单工厂");
            product.defaultRealize();
            product.custRealize();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

}
