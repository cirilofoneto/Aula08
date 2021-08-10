import java.util.Scanner;

public class Desafio02 {
	/*
	 * Para um ano ser bissexto ele deve ser múltiplo de 4, mas não ser múltiplo de
	 * 100 (com exceção dos anos que forem múltiplos de 400). Crie um programa com
	 * uma função que receba um ano em uma variável inteira, faça os testes para
	 * verificar se ele é bissexto, e retorne uma String dizendo “O ano informado é
	 * bissexto” ou “O ano informado não é bissexto). A main do seu programa deve
	 * conter a digitação do ano, a chamada da função e a exibição do texto
	 * retornado.
	 * 
	 * 
	 */
	public static String eBissexto(int ano) {

		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
			return "é bissexto";

		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
			return "é bissexto";
		} else {
			System.out.println(ano + " não é bissexto");
			return "Não é bissexto";
		}

	}

	public static void main(String[] args) {
		int ano = 0;
		
		
		Scanner pega = new Scanner(System.in); 
		System.out.println("Digite um Ano");
		ano = pega.nextInt();
		
		eBissexto(ano);
		
		
		
		
	}
}
