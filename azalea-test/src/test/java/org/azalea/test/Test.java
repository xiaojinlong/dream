package org.azalea.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@TestAnnotation(id=3,msg="ni hao")
public class Test {
	@Check("这是个A")
	int a;
	
	@Perform
	public void testMethod(){}
	
	public static void main(String[] args) {
		boolean hasAnnotation = Test.class.isAnnotationPresent(TestAnnotation.class);
		if (hasAnnotation){
			TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);
			System.out.println(testAnnotation.id() +" " + testAnnotation.msg());
		}
		
		
		try {
			Field a = Test.class.getDeclaredField("a");
			a.setAccessible(true);
			Check check = a.getAnnotation(Check.class);
			if (check != null){
				System.out.println(check.value());
			}
			
			Method[] methods= Test.class.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println("方法被那个注解在使用："+methods[i].getName());
			}
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
