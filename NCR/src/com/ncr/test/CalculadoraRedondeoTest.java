package com.ncr.test;

import com.ncr.modelo.CalculadoraRedondeo;

public class CalculadoraRedondeoTest 
{
	public static void main(String[] args)
	{
		CalculadoraRedondeo calculadora = new CalculadoraRedondeo();
		
		System.out.println(calculadora.redondear(132, 5));
	}
}