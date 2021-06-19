import java.util.Scanner;

public class Desafio06 
{
/*Poker � um jogo muito conhecido pela sua liga��o com a matem�tica, afinal, a partir de uma s�rie de cartas que os jogadores podem ter em m�os, existe uma possibilidade limitada de combina��es.
Algumas das combina��es s�o:
�	Par: duas cartas de valores iguais, independente do naipe, e tr�s cartas de valores diferentes.
�	Trinca: tr�s cartas de valores iguais, independente do naipe, e duas cartas de valores diferentes.
�	Flush: todas as cartas do mesmo naipe, independente do valor.
�	Quadra: quatro cartas do mesmo valor, independente do naipe.
�	Fun��o agregadora: passa os dados pelas 4 fun��es acima e informa o tipo de jogo que o jogador tem.
Supondo um jogo onde os jogadores t�m 5 cartas na m�o, crie fun��es para verificar se as 5 cartas formam cada um dos 4 jogos acima.
*/
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		String cartas[] = new String[5];

		System.out.println("POKER\n");

		System.out.println("Verificando a m�o do jogador.\n");

		System.out.println("Informe suas cartas:\n");

		for (int i = 0; i < cartas.length; i++)
		{
			System.out.println("Carta" + (i+1));
			cartas[i] = leitor.next();
		}

		if (Funcoes.par(cartas))
		{
			System.out.println("Voc� possui um PAR.");			
		}
			else if (Funcoes.trinca(cartas))
		{
			System.out.println("Voc� possui uma TRINCA.");
		}
		else if (Funcoes.quadra(cartas))
		{
			System.out.println("Voc� possui uma QUADRA.");
		}

		leitor.close();

	}

}
