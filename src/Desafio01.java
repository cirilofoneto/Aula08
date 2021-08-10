import java.util.Scanner;

public class Desafio01 {
	/*
	 * � muito comum que programas que realizam cadastros de pessoas precisem
	 * validar a sigla do estado a que elas pertencem. Crie uma fun��o que receba
	 * uma String contendo a sigla de um estado e verifique se esse estado existe ou
	 * n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista,
	 * ele deve retornar um boolean false. A main do seu programa deve conter a
	 * digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para
	 * afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.
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
			System.out.println("Estado n�o Encontrado!");
		}
			
		
		
		
		
	}
}
