package com.dirk.learn.b_factory_method.a_factory;

/**
 * @author Dirk
 * @date 2020-11-21 10:09
 * @description 具体产品01
 */
public class Product_01 extends AbstractProduct {

    @Override
    public void custRealize() {
        System.out.println("产品01自定义实现，产品名称为：" + this.getName());
    }

}
