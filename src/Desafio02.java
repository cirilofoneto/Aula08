import java.util.Scanner;

public class Desafio02 {
	/*
	 * Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de
	 * 100 (com exce��o dos anos que forem m�ltiplos de 400). Crie um programa com
	 * uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para
	 * verificar se ele � bissexto, e retorne uma String dizendo �O ano informado �
	 * bissexto� ou �O ano informado n�o � bissexto). A main do seu programa deve
	 * conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto
	 * retornado.
	 * 
	 * 
	 */
	public static String eBissexto(int ano) {

		if (ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");
			return "� bissexto";

		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " � bissexto.");
			return "� bissexto";
		} else {
			System.out.println(ano + " n�o � bissexto");
			return "N�o � bissexto";
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
