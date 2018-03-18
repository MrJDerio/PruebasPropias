package com.ipartek.primerBoot.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ipartek.primerBoot.beans.Barcelona;
import com.ipartek.primerBoot.beans.Camiseta;
import com.ipartek.primerBoot.beans.Jugador;
import com.ipartek.primerBoot.beans.Marca;

@Configuration
public class AppConfig {
	
	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona pepe() {
		return new Barcelona();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
