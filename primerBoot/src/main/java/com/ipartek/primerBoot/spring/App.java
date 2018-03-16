package com.ipartek.primerBoot.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ipartek.primerBoot.Interfaces.IEquipo;
import com.ipartek.primerBoot.beans.Barcelona;
//import com.ipartek.primerBoot.beans.Ciudad;
import com.ipartek.primerBoot.beans.Jugador;
//import com.ipartek.primerBoot.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("/xml/beans.xml");
		
		//Jugador jug = (Jugador) appContext.getBean("messi");
		
		//System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar());
		
		Jugador jug = (Jugador) appContext.getBean("messi");

		System.out.println(jug.getNombre() + " " +jug.getEquipo().mostrar());
		((ConfigurableApplicationContext)appContext).close();
	}

}
