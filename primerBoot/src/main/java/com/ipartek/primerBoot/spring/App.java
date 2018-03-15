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
		Persona per2 = (Persona) appContext.getBean("persona");
		
		per.setId(1);
		per.setNombre("Jaime");
		per.setApodo("Jaimito");
		
		
		System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());
		System.out.println(per2.getId()+" "+per2.getNombre()+" "+per2.getApodo()+" "+per2.getPais().getNombre()+" "+per2.getCiudad().getNombre());

		//hola
		((ConfigurableApplicationContext)appContext).close();
	}

}
