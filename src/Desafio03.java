import java.util.Scanner;

public class Desafio03 {
	/*
	 * Você deve se lembrar que os triângulos possuem uma regra para existirem: a
	 * soma de QUAISQUER dois lados tem que ser maior do que o lado restante. E deve
	 * se lembrar, também, que os triângulos podem ser de três tipos: equiláteros,
	 * escalenos ou isósceles. Crie uma função que valida se um triângulo existe ou
	 * não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve
	 * primeiro validar se o triângulo existe). A main do seu programa deve ter a
	 * leitura dos lados do triângulo e a chamada da função que retorna o tipo dele.
	 * 
	 */
	public static boolean verTriagulo(double lado1, double lado2, double lado3) {

		if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
			return false;
			// Não Existem Tringulo com um lado 0;
		}

		else {
			if ((lado1 + lado2) > lado3) {
				return true;
			}

			if ((lado1 + lado3) > lado2) {
				return true;
			}

			if (lado2 + lado3 > lado1) {
				return true;

			} else {
				return false;
			}
		}
	}

	public static String nomeTriagulo(double lado1, double lado2, double lado3) {

		if (lado1 == lado2 && lado1 == lado3) {
			return "O Triangulo é equilátero";
		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			return "O triangulo é escaleno";
			// System.out.println("O triangulo é escaleno");
		} else {
			return "O triagulo é isósceles";

		}
	}

	public static void main(String[] args) {
		Scanner pega = new Scanner(System.in);

		double lado1, lado2, lado3;

		System.out.println("Digite valor Lado1: ");
		lado1 = pega.nextDouble();

		System.out.println("Digite valor Lado2: ");
		lado2 = pega.nextDouble();

		System.out.println("Digite valor Lado3: ");
		lado3 = pega.nextDouble();

		if (verTriagulo(lado1, lado2, lado3) == true) {
			System.out.println("Triangulo Existem");
			System.out.println(nomeTriagulo(lado1, lado2, lado3));
		} else {
			System.out.println("tringulo não Existem");

		}
	}
}
