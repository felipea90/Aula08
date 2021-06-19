import java.util.Scanner;

public class Desafio04 
{
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 */
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		double horaAula;
		int numeroAulas;

		System.out.println("Informe o valor em reais R$ da hora aula nesta institui��o.");
		horaAula = leitor.nextDouble();
		
		System.out.println("Para calcular seu sal�rio base precisamos saber quantas aulas semanais o professor tem na institui��o.");
		numeroAulas = leitor.nextInt();

		System.out.println("O sal�rio do professor est� composto da seguinte forma:\n");

		Funcoes.salarioProfessor(numeroAulas, horaAula);

		leitor.close();
	}
}
