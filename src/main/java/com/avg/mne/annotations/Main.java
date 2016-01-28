package com.avg.mne.annotations;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
public class Main {

	public static void main(String[] args) {
		try {
			Student s = new Student();
			Class<Student> sClass = (Class<Student>) s.getClass();
			
			Annotation[] as = sClass.getAnnotations();
			Arrays.asList(as).stream().forEach(a -> System.out.println(a.annotationType()));
			
			if(sClass.isAnnotationPresent(MyCustomAnnotation.class)){
				Annotation annotation = sClass.getAnnotation(MyCustomAnnotation.class);
				MyCustomAnnotation mca = (MyCustomAnnotation) annotation;
				System.out.println(mca.studentName());
				System.out.println(mca.studentAge());
				System.out.println(mca.studentAddress());
				System.out.println(mca.studentStream());
			}
			
			
			
		} catch (Exception e) {
		}
	}
}
