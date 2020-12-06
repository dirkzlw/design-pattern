package com.dirk.learn.c.abstractfactory;

/**
 * @author Dirk
 * @date 2020-12-06 17:14
 * @description 抽象工厂模式，为一组相互依赖的对象提供一个借口，无须指定它们的具体类
 */
public class Client {

    public static void main(String[] args){

        AbstractFactory factory = new ProductFacotry_01();

        AbstractProduceA produceA_01 = factory.creataProductA();
        produceA_01.custRealize();

    }

}
