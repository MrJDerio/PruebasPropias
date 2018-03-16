package com.ipartek.primerBoot.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PruebasBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization (Object bean, String nombreBean) throws BeansException {
		System.out.println("Despues de la Inicializacion");
		return null;
	}
	
	@Override
	public Object postProcessBeforeInitialization (Object bean, String nombreBean) throws BeansException {
		System.out.println("Antes de la Inicializacion");
		return null;
	}
	
}
