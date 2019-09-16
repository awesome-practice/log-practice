package com.practice.springboot.log;

import com.practice.springboot.log.defaultlog.DefaultLogging;
import com.practice.springboot.log.programming.ProgrammingLogging;
import com.practice.springboot.log.specificlog.SpecificInstanceLogging;
import com.practice.springboot.log.specificlog.SpecificStaticLogging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luo Bao Ding
 * @since 2019/9/10
 */
@RestController
public class ShowLogObject implements InitializingBean, CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final DefaultLogging defaultLogging;
    private final SpecificInstanceLogging instanceLogging;
    private final SpecificStaticLogging staticLogging;

    private final ProgrammingLogging programmingLogging;

    public ShowLogObject(DefaultLogging defaultLogging, SpecificInstanceLogging instanceLogging, SpecificStaticLogging staticLogging, ProgrammingLogging programmingLogging) {
        this.defaultLogging = defaultLogging;
        this.instanceLogging = instanceLogging;
        this.staticLogging = staticLogging;
        this.programmingLogging = programmingLogging;
    }

    /**
     * 发现: refresh后logger实例未变
     */
    @RequestMapping("/show")
    public void show() {
        logger.info(defaultLogging.getClass().getSimpleName() + ",logger@" + DefaultLogging.getLOGGER().hashCode());
        logger.info(this.instanceLogging.getClass().getSimpleName() + ",logger@" + this.instanceLogging.getLOGGER().hashCode());
        logger.info(staticLogging.getClass().getSimpleName() + ",logger@" + SpecificStaticLogging.getLOGGER().hashCode());
        logger.info(programmingLogging.getClass().getSimpleName() + ",logger@" + programmingLogging.getLogger().hashCode());

    }

    @RequestMapping("/logging")
    public void logAll(){
        logger.info("start logging");

        defaultLogging.log();
        instanceLogging.log();
        staticLogging.log();
        programmingLogging.log();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        show();
    }

    @Override
    public void run(String... args) throws Exception {

        logAll();

    }



}
