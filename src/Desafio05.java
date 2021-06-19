import java.util.Scanner;

public class Desafio05 
{
	/*A rede de supermercados MercaJava est� levando a s�rio as restri��es de isolamento social no Brasil. Est�o trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s solicita��es.
	Toda a identifica��o das medidas necess�rias � feita atrav�s de c�meras e sensores de temperaturas. Sua tarefa � criar as fun��es que recebam essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
	As fun��es s�o:
	�	Temperatura: Clientes com temperatura superior a 37,0 graus n�o podem entrar no estabelecimento.
	�	M�scara: Clientes sem m�scara n�o podem entrar no estabelecimento.
	�	Fam�lias: grupos com mais de 2 pessoas n�o podem entrar no estabelecimento.
	�	Fun��o agregadora: s� autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
	*/
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		double temperatura;
		int familia, mascara;

		System.out.println("Programa para cuidados com isolamento social.\n");

		System.out.println("Aproxime o rosto do sensor para medi��o da temperatura:");
		temperatura = leitor.nextDouble();

		System.out.println("Informe quantas pessoas est�o no seu grupo:");
		familia = leitor.nextInt();

		System.out.println("Informe se est� usando ou n�o m�scara de prote��o:");
		System.out.println("1 - SIM");
		System.out.println("2 - N�O");
		mascara = leitor.nextInt();

		if (Funcoes.agregadora(temperatura, familia, mascara))
		{
			System.out.println("Acesso Liberado!");
		}
		else
		{
		System.out.println("Acesso N�o Permitido!");
		}

		leitor.close();

	}

}
