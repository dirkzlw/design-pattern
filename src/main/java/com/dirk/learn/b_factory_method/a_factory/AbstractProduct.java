package com.dirk.learn.b_factory_method.a_factory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dirk
 * @date 2020-11-21 10:06
 * @description 抽象产品类
 */
@Setter
@Getter
public abstract class AbstractProduct {

    protected String name;

    public void defaultRealize() {
        System.out.println("抽象产品的默认实现");
    }

    /**
     * 自定义实现，由子类完成
     */
    public abstract void custRealize();
}
