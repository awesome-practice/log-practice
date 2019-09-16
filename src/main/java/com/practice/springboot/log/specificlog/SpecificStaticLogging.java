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
public class SpecificStaticLogging  {
    private final static Logger LOGGER = LoggerFactory.getLogger(SpecificStaticLogging.class);


    public void log() {
        LOGGER.info("@i am static");
    }



    public static Logger getLOGGER() {
        return LOGGER;
    }
}
