package com.ipartek.primerBoot.beans;

import org.springframework.stereotype.Component;

import com.ipartek.primerBoot.Interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	@Override
	public String mostrar() {
		return "Juventus";
	}

}
