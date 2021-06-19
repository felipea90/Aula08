import java.util.Scanner;

public class Desafio03 
{
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
	E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
	Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
	A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 
	*/
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Digite os valores dos lados de um Tri�ngulo:");
		
		System.out.println("Lado 1:");
		lado1 = leitor.nextInt();
		
		System.out.println("Lado 2:");
		lado2 = leitor.nextInt();
		
		System.out.println("Lado 3:");
		lado3 = leitor.nextInt();
	
		Funcoes.triangulo(lado1, lado2, lado3);
		
		leitor.close();
	}
}
