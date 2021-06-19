public class Funcoes 
{
	public static boolean temperatura(double valor1)
	{
		if (valor1 <= 37)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean familia(int valor1)
	{
		if (valor1 <= 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean mascara(int valor1)
	{
		{
			if (valor1 == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	public static boolean agregadora(double temp, int fam, int masc)
	{
		return temperatura(temp) && familia(fam) && mascara(masc);
	}

	public static void salarioProfessor(int valor1, Double valor2)
	{
		double salarioBase, horaAtividade, descansoSemanalRemunerado, salario;

		salarioBase = valor1 * 4.5 * valor2;

		horaAtividade = salarioBase * 0.05;

		descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
		
		salario = salarioBase + horaAtividade + descansoSemanalRemunerado;

		System.out.println("O sal�rio base � R$ " + salarioBase);
		System.out.println("Hora-atividade R$ " + horaAtividade);
		System.out.println("DSR R$ " + descansoSemanalRemunerado);
		System.out.println("Sal�rio total R$ " + salario);
	}

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
				System.out.println("A soma de dois lados n�o pode ser menor do que o terceiro.\n");
				System.out.println("Este tri�ngulo n�o existe.");
			}
			else
			{
				
				if (lado1 == lado2 && lado1 == lado3)
				{
					System.out.println("Este � um Tri�ngulo Equil�tero");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				{
					System.out.println("Este � um Tri�ngulo Is�sceles");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else
				{
					System.out.println("Este � um Tri�ngulo Escaleno");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
			}
		}
		else
		{
			System.out.println("O lados n�o podem ser Zero.\n");
			System.out.println("Este tri�ngulo n�o existe.");
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
		
		System.out.println("O total do carrinho � R$" + soma);
	}
	
	public static void exibirMenu() 
	{
		System.out.println("FIAP STORE! A LOJA DOS FIAPERS!\n");
		System.out.println("1 - Informar todos os valores do carrinho");
		System.out.println("2 - Exibir total do carrinho");
		System.out.println("3 - Sair");
	}

	public static boolean par(String cartas[]) 
	{
		int qtdeIguais=0;

		for(int i=0; i<cartas.length-1;i++) 
		{
			for(int i2=i+1; i2<cartas.length;i2++) 
			{
				if (cartas[i].equals(cartas[i2])) 
				{
					qtdeIguais = qtdeIguais + 1;
				}
			}
		}
		
		if (qtdeIguais == 2) 
		{
			return true;
		}
		return false;
	}

	public static boolean trinca(String cartas[]) 
	{
		int qtdeIguais=0;

		for(int i=0; i<cartas.length-1;i++) 
		{
			for(int i2=i+1; i2<cartas.length;i2++) 
			{
				if (cartas[i].equals(cartas[i2])) 
				{
					qtdeIguais = qtdeIguais + 1;
				}
			}
		}
		
		if (qtdeIguais == 3) 
		{
			return true;
		}
		return false;
	}

	public static boolean quadra(String cartas[]) 
	{
		int qtdeIguais=0;

		for(int i=0; i<cartas.length-1;i++) 
		{
			for(int i2=i+1; i2<cartas.length;i2++) 
			{
				if (cartas[i].equals(cartas[i2])) 
				{
					qtdeIguais = qtdeIguais + 1;
				}
			}
		}
		
		if (qtdeIguais == 4) 
		{
			return true;
		}
		return false;
	}
}
