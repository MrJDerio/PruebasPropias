package com.ipartek.primerBoot.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ipartek.primerBoot.beans.Ciudad;
import com.ipartek.primerBoot.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("/xml/beans.xml");
		
		Persona per = (Persona) appContext.getBean("persona");
		
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
		
		
		
		System.out.println(per.getApodo());
		System.out.println(ciu.getNombre());

		((ConfigurableApplicationContext)appContext).close();
	}

}
