package com.ncr.modelo;

public class DenominacionConMonedas extends Denominacion 
{
	private int monedas;

	public DenominacionConMonedas(int valor, int monedas) 
	{
		super(valor);
		this.monedas = monedas;
	}

	public int getMonedas() 
	{
		return monedas;
	}

	@Override
	public String toString() 
	{
		return "" + valor + " " + monedas;
	}
}