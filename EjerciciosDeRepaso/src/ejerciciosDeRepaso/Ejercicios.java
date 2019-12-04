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

	public static void ejercicio5() {

		for (int i = 200; i > 0; i--) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
		}
	}

	public static void ejercicio6() {
		Scanner leer = new Scanner(System.in);
		int numero1, numero2, opcion;

		System.out.println("Introduce primer número:");
		numero1 = leer.nextInt();

		System.out.println("Introduce segundo número:");
		numero2 = leer.nextInt();

		do {
			System.out.println("1- Sumar Operandos");
			System.out.println("2- Restar Operandos");
			System.out.println("3- Multiplicar Operandos");
			System.out.println("4- Dividir Operandos");
			System.out.println("5- Resto división");
			System.out.println("6- Salir");
			System.out.println("\n Escoja una opción:");

			switch (opcion = leer.nextInt()) {
			case 1:
				System.out.println(numero1 + numero2);
				break;
			case 2:
				System.out.println(numero1 - numero2);
				break;
			case 3:
				System.out.println(numero1 * numero2);
				break;
			case 4:
				System.out.println((double) numero1 / numero2);
				break;
			case 5:
				System.out.println(numero1 % numero2);
				break;
			}

		} while (opcion != 6);
	}

	public static void ejercicio7() {
		Scanner leer = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Introduzca número: (0 para salir)");
			numero = leer.nextInt();

			if ((numero < 10) && (numero % 2 != 0)) {
				System.out.println("S1");
			} else if (numero % 3 == 0) {
				System.out.println("S3");
			}

			if ((numero > 10) && (numero < 20) && (numero % 2 == 0)) {
				System.out.println("S2");
			}

			if (((numero > 20) && (numero % 7 == 0)) || (numero > 50)) {
				System.out.println("S4");
			}
		} while (numero != 0);

	}

	public static void ejercicio8() {
		Scanner leer = new Scanner(System.in);
		int resultado = 0, numero;
		do {
			System.out.println("Introduzca número:");
			if (((numero = leer.nextInt()) > 0)) {
				resultado += numero;
			}
		} while (numero >= 0);

		System.out.println(resultado);
	}

	public static void ejercicio9() {
		Scanner leer = new Scanner(System.in);
		int mayor = -999999999, menor = 999999999, numero;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca número:");
			if ((numero = leer.nextInt()) > mayor) {
				mayor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		System.out.println("Mayor: " + mayor + "\nMenor: " + menor);
	}

	public static void ejercicio10() {
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca número:");

		int numero = leer.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + numero + " = " + i * numero);
		}
	}

	public static void ejercicio12() {
		Scanner leer = new Scanner(System.in);
		int numero, factorial = 1;

		System.out.println("Introduzca número: ");

		numero = leer.nextInt();

		for (int i = numero; i > 0; i--) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + numero + " es: " + factorial);
	}

}
