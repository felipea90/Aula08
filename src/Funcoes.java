public class Funcoes {

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
