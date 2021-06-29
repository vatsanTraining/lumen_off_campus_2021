package com.training.tools;

import com.training.Employee;
import com.training.stereotypes.Example;

import java.lang.reflect.*;
public class MyAnnotationProcessor {

	public static void main(String[] args) {
		
		
		Employee  suresh = new Employee();
		
		
		
		Class<?> classRef = suresh.getClass();
		
		try {
			
			Example clsLevel = classRef.getAnnotation(Example.class);
			
			Method  methodRef = classRef.getMethod("showDetails");
			
			                   
			
			Example anno = methodRef.getAnnotation(Example.class);
			             
			
			StringBuffer buffer = new StringBuffer(anno.title());
			 buffer.append(anno.version());
			 
			System.out.println("Annotation Processing Result"+ buffer.toString());
			
			System.out.println("Class Level Annotation");
			System.out.println(clsLevel.title() + clsLevel.version());
			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
	}
}
