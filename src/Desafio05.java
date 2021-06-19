import java.util.Scanner;

public class Desafio05 
{
	/*A rede de supermercados MercaJava está levando a sério as restrições de isolamento social no Brasil. Estão trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que estão atendendo às solicitações.
	Toda a identificação das medidas necessárias é feita através de câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
	As funções são:
	•	Temperatura: Clientes com temperatura superior a 37,0 graus não podem entrar no estabelecimento.
	•	Máscara: Clientes sem máscara não podem entrar no estabelecimento.
	•	Famílias: grupos com mais de 2 pessoas não podem entrar no estabelecimento.
	•	Função agregadora: só autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
	*/
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		double temperatura;
		int familia, mascara;

		System.out.println("Programa para cuidados com isolamento social.\n");

		System.out.println("Aproxime o rosto do sensor para medição da temperatura:");
		temperatura = leitor.nextDouble();

		System.out.println("Informe quantas pessoas estão no seu grupo:");
		familia = leitor.nextInt();

		System.out.println("Informe se está usando ou não máscara de proteção:");
		System.out.println("1 - SIM");
		System.out.println("2 - NÃO");
		mascara = leitor.nextInt();

		if (Funcoes.agregadora(temperatura, familia, mascara))
		{
			System.out.println("Acesso Liberado!");
		}
		else
		{
		System.out.println("Acesso Não Permitido!");
		}

		leitor.close();

	}

}
