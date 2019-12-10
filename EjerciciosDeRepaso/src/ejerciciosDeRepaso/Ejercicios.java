package ejerciciosDeRepaso;

/**
 * @author borjaLoren
 * @version 1.0.0
 * @date 10-12-2019
 * 
 * Ejercicios de repaso relacionados con las unidades 1, 2 y 3.
 */
import java.util.Scanner;

public class Ejercicios {

	/**
	 * Programa en el cual introduciremos una distancia expresada en metros y una
	 * cantidad en segundos, ambas sin decimales. Se trata de calcular la velocidad
	 * expresada en Km/h, la cual s� que puede tener decimales.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio2() {
		Scanner leer = new Scanner(System.in);
		int espacio = 0, tiempo = 0;

		try {
			System.out.println("Introduzca distancia (metros) recorrida:");
			espacio = leer.nextInt();

			System.out.println("Introduzca tiempo (segundos) empleado en recorrerla:");
			tiempo = leer.nextInt();

			System.out.println("La velocidad resultante es: " + (double) (espacio / tiempo) * 3.6 + " Km/h");
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que calcula la nota final de un alumno en base a los porcentajes de
	 * evaluaci�n asociados a la teor�a, pr�ctica y actitud.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio3() {
		Scanner leer = new Scanner(System.in);
		double notaFinal = 0;

		try {
			System.out.println("Introduzca nota del examen (50%):");
			notaFinal += (leer.nextDouble() * 50) / 100;

			System.out.println("Introduzca nota de los trabajos (40%):");
			notaFinal += (leer.nextDouble() * 40) / 100;

			System.out.println("Introduzca nota por actitud (10%):");
			notaFinal += (leer.nextDouble() * 10) / 100;

			System.out.println("Su nota es: " + notaFinal);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que recibe un n�mero por pantalla y devuelve "Prueba superada" en
	 * caso de que el n�mero introducido sea par y mayor que 10 o si el n�mero es
	 * impar y m�ltiplo de 3.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio4() {
		Scanner leer = new Scanner(System.in);
		int numero;

		try {
			System.out.println("Introduzca n�mero:");
			numero = leer.nextInt();

			if (((numero % 2 == 0) && (numero > 10)) || ((numero % 3 == 0) && (numero % 2 != 0))) {
				System.out.println("Prueba superada.");
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que muestra los n�meros pares y m�ltiplos de 3 menores a 200.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio5() {

		for (int i = 200; i > 0; i--) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * Programa en el que se piden 2 n�meros y posteriormente muestra un men� con
	 * distintas opciones. El programa se ejecuta hasta pulsar 6.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio6() {
		Scanner leer = new Scanner(System.in);
		int numero1, numero2, opcion;

		try {
			System.out.println("Introduce primer n�mero:");
			numero1 = leer.nextInt();

			System.out.println("Introduce segundo n�mero:");
			numero2 = leer.nextInt();

			do {
				System.out.println("1- Sumar Operandos");
				System.out.println("2- Restar Operandos");
				System.out.println("3- Multiplicar Operandos");
				System.out.println("4- Dividir Operandos");
				System.out.println("5- Resto divisi�n");
				System.out.println("6- Salir");
				System.out.println("\n Escoja una opci�n:");

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
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que al introducir un n�mero por consola muestra diferentes
	 * resultados si cumple algunas de las condiciones establecidas. Finaliza al
	 * pulsar 0.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio7() {
		Scanner leer = new Scanner(System.in);
		int numero;

		try {
			do {
				System.out.println("Introduzca n�mero: (0 para salir)");
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
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que suma todos los n�meros introducidos por teclado hasta que el
	 * usuario introduce un n�mero negativo. Tras esto, muestra el resultado de la
	 * suma por pantalla.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio8() {
		Scanner leer = new Scanner(System.in);
		int resultado = 0, numero;

		try {
			do {
				System.out.println("Introduzca n�mero:");
				if (((numero = leer.nextInt()) > 0)) {
					resultado += numero;
				}
			} while (numero >= 0);

			System.out.println(resultado);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Intrduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que lee 10 n�meros introducidos por teclado, tanto positivos como
	 * negativos y muestra cu�l es el mayor y menor de ellos.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio9() {
		Scanner leer = new Scanner(System.in);
		int mayor = -999999999, menor = 999999999, numero;

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Introduzca n�mero:");
				if ((numero = leer.nextInt()) > mayor) {
					mayor = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
			System.out.println("Mayor: " + mayor + "\nMenor: " + menor);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos v�lidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que muestra la tabla de multiplicar del n�mero introducido por
	 * teclado.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio10() {
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca n�mero:");

		int numero = leer.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + numero + " = " + i * numero);
		}
	}

	/**
	 * Programa que genera una secuencia escalonada hasta un n�mero N que se
	 * solicitar� al usuario.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio11() {
		Scanner leer = new Scanner(System.in);

		System.out.println("Inserte n�mero:");
		int numero = leer.nextInt();

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

	/**
	 * Programa que calcula el factorial de un n�mero le�do por teclado.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio12() {
		Scanner leer = new Scanner(System.in);
		int numero, factorial = 1;

		System.out.println("Introduzca n�mero: ");

		numero = leer.nextInt();

		while (numero != 0) {
			factorial *= numero;
			numero--;
		}

		System.out.println("Su factorial es: " + factorial);
	}

}
