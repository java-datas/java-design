package cn.design.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhangkun
 * @create 2020-07-05 1:50 PM
 * @desc
 **/
@SpringBootApplication(scanBasePackages = {"cn.design.demo.*"})
public class Application {

    protected final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = null;
        try {
            long start = System.currentTimeMillis();
            SpringApplication sa = new SpringApplication(Application.class);
            context = sa.run(args);
            Thread.sleep(Long.MAX_VALUE);
            long period = System.currentTimeMillis() - start;
            logger.error("Application start successfully in {} ms.", period);
        } catch (Exception e) {
            logger.error("Application start error:", e);
            System.exit(-1);
        } finally {
            if (context != null) {
                context.close();
            }
        }
    }
}
