package com.ncr.test;

import java.io.IOException;
import java.util.List;

import com.ncr.io.LectorArchivo;
import com.ncr.io.LectorArchivoConNivel;
import com.ncr.modelo.Denominacion;

public class Test 
{
	public static final String DENOMINACIONES = "C:\\Users\\Rodrigo\\Documents\\Repositorio\\Eclipse\\ncr\\NCR\\src\\resources\\denominaciones.txt";
	public static final String DENOMINACIONES_CON_NIVEL = "C:\\Users\\Rodrigo\\Documents\\Repositorio\\Eclipse\\ncr\\NCR\\src\\resources\\denominaciones_nivel.txt";
	
	public static void main(String[] args)
	{
		try 
		{
			//probarLectorArchivo();
			probarLectorArchivoConNivel();
		} 
		catch (NumberFormatException | IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void probarLectorArchivo() throws NumberFormatException, IOException
	{
		LectorArchivo lector = new LectorArchivo();
		List<Denominacion> denominaciones = lector.leerArchivo(DENOMINACIONES);
		System.out.println("Denominaciones\n" + denominaciones);
	}
	
	public static void probarLectorArchivoConNivel() throws NumberFormatException, IOException
	{
		LectorArchivo lector = new LectorArchivoConNivel();
		List<Denominacion> denominaciones = lector.leerArchivo(DENOMINACIONES_CON_NIVEL);
		System.out.println("Denominaciones\n" + denominaciones);
	}
}