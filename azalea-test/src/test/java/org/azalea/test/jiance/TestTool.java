package org.azalea.test.jiance;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestTool {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoBug noBug = new NoBug();
		
		Method[] methods = noBug.getClass().getDeclaredMethods();
		
		for (Method method : methods) {
			if (method.isAnnotationPresent(JianCe.class)){
				method.setAccessible(true);
				try {
					method.invoke(noBug, null);
				} catch (Exception e) {
					System.out.println("错误异常方法名称:"+method.getName());
					System.out.println("错误异常getSimpleName名称:"+e.getCause().getClass().getSimpleName());
					System.out.println("错误异常getMessage名称:"+e.getCause().getMessage());
					
				}
			}
		}
	}
	
	

}
