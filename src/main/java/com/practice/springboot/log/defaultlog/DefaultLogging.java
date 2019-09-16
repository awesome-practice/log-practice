package com.practice.springboot.log.defaultlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Luo Bao Ding
 * @since 2018/8/16
 */
@Component
public class DefaultLogging {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultLogging.class);

    public void log() {
        LOGGER.info("@hello {}", "Jack");
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }
}
