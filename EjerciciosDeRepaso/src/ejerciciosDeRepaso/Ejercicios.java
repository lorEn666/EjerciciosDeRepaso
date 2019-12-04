package ejerciciosDeRepaso;

import java.util.Scanner;

public class Ejercicios {

	public static void ejercicio2() {
		Scanner leer = new Scanner(System.in);
		int espacio, tiempo;

		System.out.println("Introduzca distancia (metros) recorrida:");
		espacio = leer.nextInt() / 1000;

		System.out.println("Introduzca tiempo (segundos) empleado en recorrerla:");
		tiempo = leer.nextInt() / 3600;

		System.out.println("La velocidad resultante es: " + (double) espacio / tiempo + " Km/h");
	}

	public static void ejercicio3() {
		Scanner leer = new Scanner(System.in);
		double notaFinal = 0;

		System.out.println("Introduzca nota del examen (50%):");
		notaFinal += (leer.nextDouble() * 50) / 100;

		System.out.println("Introduzca nota de los trabajos (40%):");
		notaFinal += (leer.nextDouble() * 40) / 100;

		System.out.println("Introduzca nota por actitud (10%):");
		notaFinal += (leer.nextDouble() * 10) / 100;

		System.out.println("Su nota es: " + notaFinal);
	}

	public static void ejercicio4() {
		Scanner leer = new Scanner(System.in);
		int numero;

		System.out.println("Introduzca número:");
		numero = leer.nextInt();

		if (((numero % 2 == 0) && (numero > 10)) || ((numero % 3 == 0) && (numero % 2 != 0))) {
			System.out.println("Prueba superada.");
		}
	}

}
