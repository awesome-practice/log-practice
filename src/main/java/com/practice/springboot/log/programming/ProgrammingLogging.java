package com.practice.springboot.log.programming;

import com.practice.springboot.log.util.LoggerUtil;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author Luo Bao Ding
 * @since 2019/9/10
 */
@Component
public class ProgrammingLogging {

    private final Logger logger = LoggerUtil.getLogger("ProgrammingLogging");


    public void log(){
        logger.info("@i am programmatically");
    }


    public Logger getLogger() {
        return logger;
    }
}
