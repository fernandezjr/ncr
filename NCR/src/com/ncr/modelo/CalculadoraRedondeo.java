package com.ncr.modelo;

public class CalculadoraRedondeo 
{
	public int redondear(int vuelto, int denominacion)
	{
		int vueltoCortado = 0;
		
		if (denominacion <= 10) 
		{
			vueltoCortado = cortarNumero(vuelto, 1);
		}
		
		return vuelto + (denominacion - vueltoCortado);
	}
	
	private int cortarNumero(int vuelto, int digitosAmantener) 
	{
		String vueltoString = Integer.toString(vuelto);
		String vueltoCortado = vueltoString.substring(vueltoString.length()- 
				Integer.toString(digitosAmantener).length());
		
		return Integer.parseInt(vueltoCortado); 
	}
}