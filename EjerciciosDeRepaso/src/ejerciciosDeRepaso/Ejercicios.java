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
	 * expresada en Km/h, la cual sí que puede tener decimales.
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
			System.out.println("Error. Introduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que calcula la nota final de un alumno en base a los porcentajes de
	 * evaluación asociados a la teoría, práctica y actitud.
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
			System.out.println("Error. Introduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que recibe un número por pantalla y devuelve "Prueba superada" en
	 * caso de que el número introducido sea par y mayor que 10 o si el número es
	 * impar y múltiplo de 3.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio4() {
		Scanner leer = new Scanner(System.in);
		int numero;

		try {
			System.out.println("Introduzca número:");
			numero = leer.nextInt();

			if (((numero % 2 == 0) && (numero > 10)) || ((numero % 3 == 0) && (numero % 2 != 0))) {
				System.out.println("Prueba superada.");
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que muestra los números pares y múltiplos de 3 menores a 200.
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
	 * Programa en el que se piden 2 números y posteriormente muestra un menú con
	 * distintas opciones. El programa se ejecuta hasta pulsar 6.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio6() {
		Scanner leer = new Scanner(System.in);
		int numero1, numero2, opcion;

		try {
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
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que al introducir un número por consola muestra diferentes
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
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que suma todos los números introducidos por teclado hasta que el
	 * usuario introduce un número negativo. Tras esto, muestra el resultado de la
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
				System.out.println("Introduzca número:");
				if (((numero = leer.nextInt()) > 0)) {
					resultado += numero;
				}
			} while (numero >= 0);

			System.out.println(resultado);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Intrduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que lee 10 números introducidos por teclado, tanto positivos como
	 * negativos y muestra cuál es el mayor y menor de ellos.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio9() {
		Scanner leer = new Scanner(System.in);
		int mayor = -999999999, menor = 999999999, numero;

		try {
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
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error. Introduzca datos válidos.");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		}
	}

	/**
	 * Programa que muestra la tabla de multiplicar del número introducido por
	 * teclado.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio10() {
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca número:");

		int numero = leer.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + numero + " = " + i * numero);
		}
	}

	/**
	 * Programa que genera una secuencia escalonada hasta un número N que se
	 * solicitará al usuario.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio11() {
		Scanner leer = new Scanner(System.in);

		System.out.println("Inserte número:");
		int numero = leer.nextInt();

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

	/**
	 * Programa que calcula el factorial de un número leído por teclado.
	 * 
	 * @param
	 * @return
	 */
	public static void ejercicio12() {
		Scanner leer = new Scanner(System.in);
		int numero, factorial = 1;

		System.out.println("Introduzca número: ");

		numero = leer.nextInt();

		while (numero != 0) {
			factorial *= numero;
			numero--;
		}

		System.out.println("Su factorial es: " + factorial);
	}

}
