package com.ipartek.primerBoot.beans;

import com.ipartek.primerBoot.Interfaces.IEquipo;

public class Ninguno implements IEquipo{

	@Override
	public String mostrar() {
		return "Athletic";
	}

}
