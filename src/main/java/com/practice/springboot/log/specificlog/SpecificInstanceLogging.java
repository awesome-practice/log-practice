package com.practice.springboot.log.specificlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author Luo Bao Ding
 * @since 2019/9/10
 */
@Component
public class SpecificInstanceLogging {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    public void log() {
        LOGGER.info("@i am dynamic");
    }


    public Logger getLOGGER() {
        return LOGGER;
    }
}
