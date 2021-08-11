import java.util.Scanner;

public class Desafio06 {
	/*
	 * Poker é um jogo muito conhecido pela sua ligação com a matemática, afinal, a
	 * partir de uma série de cartas que os jogadores podem ter em mãos, existe uma
	 * possibilidade limitada de combinações. Algumas das combinações são: • Par:
	 * duas cartas de valores iguais, independente do naipe, e três cartas de
	 * valores diferentes. • Trinca: três cartas de valores iguais, independente do
	 * naipe, e duas cartas de valores diferentes. • Flush: todas as cartas do mesmo
	 * naipe, independente do valor. • Quadra: quatro cartas do mesmo valor,
	 * independente do naipe. • Função agregadora: passa os dados pelas 4 funções
	 * acima e informa o tipo de jogo que o jogador tem. Supondo um jogo onde os
	 * jogadores têm 5 cartas na mão, crie funções para verificar se as 5 cartas
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

		System.out.println("Digite as Cartas que esta na sua Mão");
		for (int cont = 0; cont < cartas.length; cont++) {
			cartas[cont] = pega.next();
		}

		// Laço que verificar se as cartão tem cobinações

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
