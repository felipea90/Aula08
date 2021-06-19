import java.util.Scanner;

public class Desafio04 
{
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
	 */
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		double horaAula;
		int numeroAulas;

		System.out.println("Informe o valor em reais R$ da hora aula nesta instituição.");
		horaAula = leitor.nextDouble();
		
		System.out.println("Para calcular seu salário base precisamos saber quantas aulas semanais o professor tem na instituição.");
		numeroAulas = leitor.nextInt();

		System.out.println("O salário do professor está composto da seguinte forma:\n");

		Funcoes.salarioProfessor(numeroAulas, horaAula);

		leitor.close();
	}
}
