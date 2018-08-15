package org.azalea.test.instancetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("name")
@ComponentScan("org.azalea.test.instancetest")
public class Config {

	@Autowired
	@Qualifier("component1")
	private ComponentTest c1;
	
	@Autowired
	@Qualifier("component2")
	private ComponentTest c2;
	
	@Bean("component2")
	public ComponentTest newBean(){
		return new ComponentTest();
	}
	
	public void print(){
        System.out.println("i am beanname");
        c1.show();
        c2.show();
    }
	
}
