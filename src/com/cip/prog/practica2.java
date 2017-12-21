package com.cip.prog;

//importamos la librería necesaria para usar el calendario
import java.util.Calendar;

public class practica2 {

	public static void main(String[] args) {
		
		
		// Creamos una instancia del calendario
		Calendar fecha = Calendar.getInstance();
		System.out.println("Bienvenido al sistema");
 
		// Array con los dias de la semana
		String[] strDays = new String[]{
						"Domingo",
						"Lunes",
						"Martes",
						"Miercoles",
						"Jueves",
						"Viernes",
						"Sabado"};
 
		// El dia de la semana inicia en el 1 mientras que el array empieza en el 0
		System.out.println("Hoy es " + strDays[fecha.get(Calendar.DAY_OF_WEEK) - 1]);
		
		// Variables para la hora
		int hora, minutos, segundos;
		
		// Aplicar dichos valores al método get y asociarlos a las variable
		
		hora =fecha.get(Calendar.HOUR_OF_DAY);
		minutos = fecha.get(Calendar.MINUTE);
		segundos = fecha.get(Calendar.SECOND);
		
		System.out.println("Son las "+ hora + ":" + minutos + ":" + segundos);
		System.out.println("Tiene 8 correos sin leer");

	}

}
