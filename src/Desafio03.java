import java.util.Scanner;

public class Desafio03 {
	/*
	 * Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a
	 * soma de QUAISQUER dois lados tem que ser maior do que o lado restante. E deve
	 * se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros,
	 * escalenos ou is�sceles. Crie uma fun��o que valida se um tri�ngulo existe ou
	 * n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve
	 * primeiro validar se o tri�ngulo existe). A main do seu programa deve ter a
	 * leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele.
	 * 
	 */
	public static boolean verTriagulo(double lado1, double lado2, double lado3) {

		if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
			return false;
			// N�o Existem Tringulo com um lado 0;
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
			return "O Triangulo � equil�tero";
		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			return "O triangulo � escaleno";
			// System.out.println("O triangulo � escaleno");
		} else {
			return "O triagulo � is�sceles";

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
			System.out.println("tringulo n�o Existem");

		}
	}
}
