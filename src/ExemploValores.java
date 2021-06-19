public class ExemploValores 
{
    public static void teste(int a) 
    {
        a = 100;
        System.out.println("Na FUNÇÃO 'A' vale " + a);
    }

    public static void zeraVetor(int b[]) 
    {
        for (int i=0; i<b.length; i++)
        {
            b[i] = 0;
        }

        System.out.println("Vetor na FUNÇÃO:");
        for (int i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) 
    {
        int a = 0;
        int b[] = {5, 6, 7, 8, 9};

        System.out.println("Na MAIN 'A' vale " + a);
        teste(a);
        System.out.println("Na MAIN 'A' vale " + a);

        System.out.println("\n\n");

        System.out.println("Vetor na MAIN:");
        for (int i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }

        zeraVetor(b);

        System.out.println("Vetor na MAIN:");
        for (int i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
    }    
}
