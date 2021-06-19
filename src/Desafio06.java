import java.util.Scanner;

public class Desafio06 
{
/*Poker é um jogo muito conhecido pela sua ligação com a matemática, afinal, a partir de uma série de cartas que os jogadores podem ter em mãos, existe uma possibilidade limitada de combinações.
Algumas das combinações são:
•	Par: duas cartas de valores iguais, independente do naipe, e três cartas de valores diferentes.
•	Trinca: três cartas de valores iguais, independente do naipe, e duas cartas de valores diferentes.
•	Flush: todas as cartas do mesmo naipe, independente do valor.
•	Quadra: quatro cartas do mesmo valor, independente do naipe.
•	Função agregadora: passa os dados pelas 4 funções acima e informa o tipo de jogo que o jogador tem.
Supondo um jogo onde os jogadores têm 5 cartas na mão, crie funções para verificar se as 5 cartas formam cada um dos 4 jogos acima.
*/
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		String cartas[] = new String[5];

		System.out.println("POKER\n");

		System.out.println("Verificando a mão do jogador.\n");

		System.out.println("Informe suas cartas:\n");

		for (int i = 0; i < cartas.length; i++)
		{
			System.out.println("Carta" + (i+1));
			cartas[i] = leitor.next();
		}

		if (Funcoes.par(cartas))
		{
			System.out.println("Você possui um PAR.");			
		}
			else if (Funcoes.trinca(cartas))
		{
			System.out.println("Você possui uma TRINCA.");
		}
		else if (Funcoes.quadra(cartas))
		{
			System.out.println("Você possui uma QUADRA.");
		}

		leitor.close();

	}

}
