package com.ipartek.primerBoot.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.ipartek.primerBoot.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("/xml/beans.xml");
		
		Persona per = (Persona) appContext.getBean("persona");
		
		
		
		
		System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());
		//hola
		((ConfigurableApplicationContext)appContext).close();
	}

}
