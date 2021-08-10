import java.util.Scanner;

public class Desafio05 {
	/*
	 * A rede de supermercados MercaJava est� levando a s�rio as restri��es de
	 * isolamento social no Brasil. Est�o trabalhando para automatizar as portas das
	 * unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s
	 * solicita��es. Toda a identifica��o das medidas necess�rias � feita atrav�s de
	 * c�meras e sensores de temperaturas. Sua tarefa � criar as fun��es que recebam
	 * essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
	 * As fun��es s�o: � Temperatura: Clientes com temperatura superior a 37,0 graus
	 * n�o podem entrar no estabelecimento. � M�scara: Clientes sem m�scara n�o
	 * podem entrar no estabelecimento. � Fam�lias: grupos com mais de 2 pessoas n�o
	 * podem entrar no estabelecimento. � Fun��o agregadora: s� autoriza a entrada
	 * no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
	 */
	public static boolean clienteTemperatura(double cliTemp) {

		if (cliTemp >= 37) {
			return false;
			// Cliente n�o pode entra.
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
			//Sem mascara n�o entra
			return false;
		}
	}
	public static boolean clienteQtdPessoas(int numeroPessoas) {
		
		if(numeroPessoas >3) {
			return false;
			//3 pessoas ou mais n�o pode entra;		
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
			//Cliente n�o cumpriu os requisitos. 
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
		
		System.out.println("Quantos pessos est�o juntas? Digite numero:");
		numeroPessoa = pega.nextInt();
		
		if(liberacaoCliente(cliTemp, cliMasc, numeroPessoa) == true) {
			System.out.println("Cliente ou Familia, pode acessar nosso MercaJAVA");
		}
		else {
			System.out.println("Infelizmente, voc� n�o pode acessar nosso MercadoJAVA");
		}
	}

}
