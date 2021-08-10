import java.util.Scanner;

public class Desafio05 {
	/*
	 * A rede de supermercados MercaJava está levando a sério as restrições de
	 * isolamento social no Brasil. Estão trabalhando para automatizar as portas das
	 * unidades, permitindo a entrada apenas das pessoas que estão atendendo às
	 * solicitações. Toda a identificação das medidas necessárias é feita através de
	 * câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam
	 * essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
	 * As funções são: • Temperatura: Clientes com temperatura superior a 37,0 graus
	 * não podem entrar no estabelecimento. • Máscara: Clientes sem máscara não
	 * podem entrar no estabelecimento. • Famílias: grupos com mais de 2 pessoas não
	 * podem entrar no estabelecimento. • Função agregadora: só autoriza a entrada
	 * no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
	 */
	public static boolean clienteTemperatura(double cliTemp) {

		if (cliTemp >= 37) {
			return false;
			// Cliente não pode entra.
		} else {
			return true;
			// Cliente pode entra.
		}
	}

	public static boolean clienteMascara(String cliMasc) {

		if (cliMasc.equalsIgnoreCase("sim")) {
			return true;
			//Se estiver de mascara pode entra.
		} else {
			//Sem mascara não entra
			return false;
		}
	}
	public static boolean clienteQtdPessoas(int numeroPessoas) {
		
		if(numeroPessoas >3) {
			return false;
			//3 pessoas ou mais não pode entra;		
		}
		else {
			return true;
		}
	}
	
	public static boolean liberacaoCliente(double cliTemp, String cliMasc, int numeroPessoa) {
		
		if(clienteTemperatura(cliTemp) == true && clienteMascara(cliMasc) == true && clienteQtdPessoas(numeroPessoa)) {
			return true;
			//Cliente pode acessar a loja;
		}
		else {
			return false;
			//Cliente não cumpriu os requisitos. 
		}
		
	}
	

	public static void main(String[] args) {

		Scanner pega = new Scanner(System.in);

		double cliTemp = 0;
		String cliMasc;
		int numeroPessoa = 0;
		
		System.out.println("Digite a Temperura do Cliente");
		cliTemp = pega.nextDouble();
		
		System.out.println("Cliente com Mascara? Digite: Sim \n Cliente sem Mascara: Digite: Nao");
		cliMasc = pega.next();
		
		System.out.println("Quantos pessos estão juntas? Digite numero:");
		numeroPessoa = pega.nextInt();
		
		if(liberacaoCliente(cliTemp, cliMasc, numeroPessoa) == true) {
			System.out.println("Cliente ou Familia, pode acessar nosso MercaJAVA");
		}
		else {
			System.out.println("Infelizmente, você não pode acessar nosso MercadoJAVA");
		}
	}

}
