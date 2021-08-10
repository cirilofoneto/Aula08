import java.util.Scanner;

public class Desafio01 {
	/*
	 * É muito comum que programas que realizam cadastros de pessoas precisem
	 * validar a sigla do estado a que elas pertencem. Crie uma função que receba
	 * uma String contendo a sigla de um estado e verifique se esse estado existe ou
	 * não. Caso exista, a função deve retornar um boolean true. Caso não exista,
	 * ele deve retornar um boolean false. A main do seu programa deve conter a
	 * digitação do estado, a chamada da função e a exibição de uma mensagem para
	 * afirmar se o estado existe ou não, dependendo do que a função retornar.
	 * 
	 */
	public static boolean sigla(String sigla) {
		
		boolean retorno; 
		String vetor[] = {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA"
		+"MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO"
		+"RR", "SC", "SP", "SE","TO" };
		
		for(int cont=0; cont<vetor.length;cont++) { 
			
			if(vetor[cont].equalsIgnoreCase(sigla)) {
			 return true;
			}
					
		}
		return false; 
	}
	
	public static void main(String[] args) {
		Scanner pega = new Scanner(System.in);
		String siglaEstado;
		
		System.out.println("Digite a sigla do estado");
		siglaEstado = pega.next();
		
		if(sigla(siglaEstado)) {
			System.out.println("Este estado Existem");
		}
		else {
			System.out.println("Estado não Encontrado!");
		}
			
		
		
		
		
	}
}
