

public class Operadores {
    public static void main(String[] args) {

        double soma = 10.5 + 15.7;
        int subtração = 113 - 5;
        int multiplicação = 20 * 7;
        int divisão = 15/3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero1 = 1;
        numero1++;
        System.out.println(numero1);

        int numero2 = 2;
        System.out.println(++numero2);

        int a = 5;
        int b =6 ;
        
        String resultadoLogica = a == b ? "Verdadeiro" : "Falso";

        String resultadoLogica2 = a != b ? "Verdadeiro" : "Falso";

        String resultadoLogica3 = a > b ? "Verdadeiro" : "Falso";

        String resultadoLogica4 = a < b ? "Verdadeiro" : "Falso";

        System.out.println(resultadoLogica);
        System.out.println(resultadoLogica2);
        System.out.println(resultadoLogica3);
        System.out.println(resultadoLogica4);


        String nomeUm = "teste";
        String nomeDois = new String("teste");

        String resultadoLogica5 = nomeUm.equals(nomeDois) ? "Verdadeiro" : "Falso";
        String resultadoLogica6 = nomeUm == nomeDois ? "Verdadeiro" : "Falso";

        System.out.println("EQUALS - > " + resultadoLogica5);
        System.out.println("= -> " + resultadoLogica6);


        boolean cond = true;
        boolean cond2 = false;

        String resultadoLogica7; 
        
        if(cond && cond2){
            resultadoLogica7 = "TRUE";
        }else{
            resultadoLogica7 = "FALSE";
        }

        if(cond || cond2){
            resultadoLogica7 = "TRUE";
        }else{
            resultadoLogica7 = "FALSE";
        }
        
    }
}
