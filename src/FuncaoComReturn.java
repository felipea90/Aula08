public class FuncaoComReturn 
{

    public static String dia(int numero)
    {
        switch(numero)
        {
            case 1:
                //System.out.println("Domingo");
                return "Domingo";

            case 2:
                return "Segunda-Feira";
            
            case 3:
                return "Ter√ßa-Feira";
            
            case 4:
                return "Quarta-Feira";
            
            case 5:
                return "Quinta-Feira";
            
            case 6:
                return "Sexta-Feira";
            
            case 7:
                return "S·bado";

            default:
                return "Dia inexistente";
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(dia(6));

        if (dia(6).equalsIgnoreCase("sexta-feira"))
        {
            System.out.println("Dia de Maldade!");
        }
    }    
}
