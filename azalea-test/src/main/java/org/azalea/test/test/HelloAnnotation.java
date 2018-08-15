package org.azalea.test.test;

import java.lang.reflect.Method;

public class HelloAnnotation {

	@Test(id="001", description="ni hen mei")
	public boolean hello2(){
		return true;
	}
	
	public static void main(String[] args) {
		Method [] methods = HelloAnnotation.class.getDeclaredMethods();
		
		for (Method method : methods) {
			Test test =method.getAnnotation(Test.class);
			if(test!=null){
				System.out.println(test.id());
			}
		}
		
		System.out.println(1 & 5);
		System.out.println(2 & 5);
		System.out.println(3 & 5);
		System.out.println(4 & 5);
		System.out.println(5 & 5);
		System.out.println(6 & 5);
		System.out.println(7 & 5);
		System.out.println(8 & 5);
		System.out.println(9 & 5);
		
	}
}
