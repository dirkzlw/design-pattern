package com.dirk.learn.b.factory.a.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Dirk
 * @date 2020-11-21 10:16
 * @description
 */
@Slf4j
public class ProductFactory extends AbstractProductFactory {

    @Override
    public <T extends AbstractProduct> T getProduct(Class<T> clazz) throws Exception {
        AbstractProduct product;
        try {
            product = (AbstractProduct) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
        return (T) product;
    }
}
