package com.practice.springboot.log.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Luo Bao Ding
 * @since 2018/8/16
 */
public class SLF4JDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(SLF4JDemo.class);

    public void test() {
        LOGGER.error("hello {}","Jack");//默念级别为error
    }

    public static void main(String[] args) {
        new SLF4JDemo().test();
    }
}
