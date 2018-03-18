package com.ipartek.primerBoot.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ipartek.primerBoot.Interfaces.IEquipo;
import com.ipartek.primerBoot.beans.Barcelona;
//import com.ipartek.primerBoot.beans.Ciudad;
import com.ipartek.primerBoot.beans.Jugador;
import com.ipartek.primerBoot.beans.Juventus;
//import com.ipartek.primerBoot.beans.Persona;
import com.ipartek.primerBoot.beans.Ninguno;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: \n1 - Barcelona\n2 - Juventus");
		int respuesta = sc.nextInt();
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
			break;
		default:
			jug.setEquipo(new Ninguno());
			break;
		}

		System.out.println(jug.getNombre() + " - " +jug.getEquipo().mostrar() + " - " + jug.getCamiseta().getNumero() + " - " + jug.getCamiseta().getMarca().getNombre());
		((ConfigurableApplicationContext)appContext).close();
	}

}
