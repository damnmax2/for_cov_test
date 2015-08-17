package org.uberio.crm.template;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.apache.log4j.Logger;


@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan
public class Application {
	
	public static final Logger log = Logger.getLogger(Application.class);
	
    public static void main(String[] args) {
    	
    	log.info("Application");
    	
        ApplicationContext ctx = SpringApplication.run(new Object[]{Application.class, AppConfiguration.class}, args);
        /*
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        */
    }
}