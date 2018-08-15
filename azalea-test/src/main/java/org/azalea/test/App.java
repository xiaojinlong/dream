package org.azalea.test;

import java.util.HashMap;
import java.util.Map;

import org.azalea.test.instancetest.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ){
//    	SpringApplication.run(App.class, args);
    	 ApplicationContext context=new AnnotationConfigApplicationContext(Config.class); 
    	 context.getBean("name",Config.class).print();//配置类本身也是一个spring ioc容器中的bean，所以可以获取到它
    }
}
