package org.azalea.test.instancetest;

import org.springframework.stereotype.Component;

@Component("component1")
public class ComponentTest {
	public void show(){
		System.out.println("hello component");
	}
}
