public class Funcoes {

	public static void triangulo(double lado1, double lado2, double lado3)
	{
		double soma1, soma2, soma3;

		if (lado1 != 0 && lado2 != 0 && lado3 != 0)
		{
			soma1 = lado1 + lado2;
			soma2 = lado1 + lado3;
			soma3 = lado2 + lado3;
			
			if(soma1 < lado3 || soma2 < lado2 || soma3 < lado1)
			{
				System.out.println("A soma de dois lados não pode ser menor do que o terceiro.\n");
				System.out.println("Este triângulo não existe.");
			}
			else
			{
				
				if (lado1 == lado2 && lado1 == lado3)
				{
					System.out.println("Este é um Triângulo Equiltero");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				{
					System.out.println("Este é um Triângulo Isósceles");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else
				{
					System.out.println("Este é um Triângulo Escaleno");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
			}
		}
		else
		{
			System.out.println("O lados não podem ser Zero.\n");
			System.out.println("Este triângulo não existe.");
		}
	}

	public static boolean login(String usuario, String senha) 
	{
		if (usuario.equalsIgnoreCase("comprador") && senha.equals("123"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean estado(String estado)
	{
		String sigla[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};

		for (int i = 0; i < sigla.length; i++)
		{
			if (sigla[i].equalsIgnoreCase(estado))
			{
				return true;
			}
		}
		return false;
	}

	public static boolean anoBissexto(int ano)
	{
		if (ano % 4 == 0 && ano % 100 != 0)
		{
			return true;
		}
		else if (ano % 400 == 0)
		{
			return true;
		}
		
		return false;
	}

	public static void somarCarrinho(double[] produtos) 
	{
		double soma = 0;
		for(int i=0; i<produtos.length;i++) 
		{
			soma = soma + produtos[i];
		}
		
		System.out.println("O total do carrinho é R$" + soma);
	}
	
	public static void exibirMenu() 
	{
		System.out.println("FIAP STORE! A LOJA DOS FIAPERS!\n");
		System.out.println("1 - Informar todos os valores do carrinho");
		System.out.println("2 - Exibir total do carrinho");
		System.out.println("3 - Sair");
	}

}
