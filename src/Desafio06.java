import java.util.Scanner;

public class Desafio06 {
	/*
	 * Poker � um jogo muito conhecido pela sua liga��o com a matem�tica, afinal, a
	 * partir de uma s�rie de cartas que os jogadores podem ter em m�os, existe uma
	 * possibilidade limitada de combina��es. Algumas das combina��es s�o: � Par:
	 * duas cartas de valores iguais, independente do naipe, e tr�s cartas de
	 * valores diferentes. � Trinca: tr�s cartas de valores iguais, independente do
	 * naipe, e duas cartas de valores diferentes. � Flush: todas as cartas do mesmo
	 * naipe, independente do valor. � Quadra: quatro cartas do mesmo valor,
	 * independente do naipe. � Fun��o agregadora: passa os dados pelas 4 fun��es
	 * acima e informa o tipo de jogo que o jogador tem. Supondo um jogo onde os
	 * jogadores t�m 5 cartas na m�o, crie fun��es para verificar se as 5 cartas
	 * formam cada um dos 4 jogos acima.
	 */

	public static String jogoPar(String[] cartas, String[] naipe) {

		return null;

	}

	public static void main(String[] args) {

		Scanner pega = new Scanner(System.in);

		int combinacoes = -5;
		String[] cartas = new String[5];
		String[] naipe = new String[5];

		System.out.println("Digite as Cartas que esta na sua M�o");
		for (int cont = 0; cont < cartas.length; cont++) {
			cartas[cont] = pega.next();
		}

		// La�o que verificar se as cart�o tem cobina��es

		for (int cont = 0; cont < cartas.length; cont++) {
			for (int cont1 = 0; cont1 < cartas.length; cont1++) {

				if (cartas[cont].equalsIgnoreCase(cartas[cont1])) {
					combinacoes++;
				}

			}
		}
		System.out.println("Numero de combinacoes: "+ combinacoes);
	}
}
