package com.dirk.learn;

import com.google.common.base.Stopwatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author Dirk
 * @date 2020-11-21 8:01
 * @description
 */
@Slf4j
public class LoopTest {

    /**
     * 10000
     * 65.61 ms 177.6 ms
     * 10000000
     * 131.9 ms 195.0 ms
     */
    @Test
    public void testLoop(){
        Integer maxObj = 10000;
        // 创建maxObj个对象
        Random random = new Random();
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < maxObj; i++) {
            String name = String.format("%" + maxObj.toString().length() + "d", i);
            int age = random.nextInt(100);
            Person person = new Person(name, age);
            personList.add(person);
        }

        Stopwatch time = Stopwatch.createStarted();
        personList.forEach(x->{
            String name = x.getName();
            Integer age = x.getAge();
        });
        time.stop();
        log.info("单次循环时间 {} ", time);

        time = Stopwatch.createStarted();
        personList.forEach(x->{
            String name = x.getName();
        });
        personList.forEach(x->{
            Integer age = x.getAge();
        });
        time.stop();
        log.info("两次循环时间 {} ", time);

    }

}

@Getter
@Setter
class Person{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
