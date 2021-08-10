import java.util.Scanner;

public class Desafio04 {
	/*
	 * Considere o cálculo do salário de um professor, disponível em
	 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	 * 
	 * Crie as funções que julgar necessárias para obter cada um dos valores que
	 * fazem parte do salário de um professor
	 */

	// Recebe horaAula é Numero de aulasSemanais
	public static double profAulista(double horaAula, int aulasSemanais) {

		double salario = 0;
		double salarioRemunerado = 0;
		double salarioTotal;

		salario = (aulasSemanais * 4.5) * horaAula;
		salarioRemunerado = salario / 6; // faço a divisão para pega 1/6
		salarioTotal = salario + salarioRemunerado;

		return salarioTotal;
		// SalarioBase professor Aulista;
	}

	public static double profMensalista(double horaAula) {

		double salario = 0;
		double salarioRemunerado = 0;
		double salarioTotal;

		salario = 22 * horaAula; // total de hora por semana * valor da hora aula
		salarioRemunerado = salario / 6; // faço a divisão para pega 1/6
		salarioTotal = salario + salarioRemunerado;

		return salarioTotal;
	}

	public static double horaExtra(double salarioBase) {

		double salarioTotal = salarioBase * 0.05;
		// Retorna o salario com a porcetagem de hora extra;
		return salarioTotal;
	}

	public static void adicionalExtra(double salarioBase) {

		Scanner pega = new Scanner(System.in);

		String selecaoHora;

		System.out.println("Digite: Sim Calcular hora Extra \n  Não - Para finalizar o Calculo");
		selecaoHora = pega.next();

		if (selecaoHora.equalsIgnoreCase(selecaoHora)) {
			double salarioTotal = salarioBase + horaExtra(salarioBase);
			System.out.println("Salario do Total é: " + salarioTotal);
		} else {
			System.out.println("Salario Base: " + salarioBase);
		}

	}

	public static void main(String[] args) {

		/*
		 * Considere o cálculo do salário de um professor, disponível em
		 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
		 * 
		 * Crie as funções que julgar necessárias para obter cada um dos valores que
		 * fazem parte do salário de um professor
		 * 
		 * 
		 */
		Scanner pega = new Scanner(System.in);

		double salarioBase;
		double salarioTotal = 0;
		String selecaoHora = "Sim";
		int aulaSemanais = 0;
		int cargoProfessor = 0;
		double horaAula;

		System.out.println("------* Calcular Salario Professsor * -----");
		System.out.println("1 - Para Professor Horista 2 - Para Professor Mensalista");
		cargoProfessor = pega.nextInt();

		switch (cargoProfessor) {// Professor Horista
		case 1:

			System.out.println("Digite numero de Aula Semanais: ");
			aulaSemanais = pega.nextInt();
			System.out.println("Digite valor hora Aula");
			horaAula = pega.nextDouble();

			salarioBase = profAulista(horaAula, aulaSemanais);
			System.out.println("Salario Base: " + salarioBase);

			/* adicionalExtra
			 * Metodo que faz o adicional notoruno se calculado caso docente tenha hora extra
			 * para receber.
			 */
			adicionalExtra(salarioBase);

			break;

		case 2:
			System.out.println("Digite o valor da hora paga");
			horaAula = pega.nextDouble();

			
			salarioBase = profMensalista(horaAula);
			
			adicionalExtra(salarioBase);

		default:
			System.out.println("Numeros Invalido");
			break;
		}

	}
}
