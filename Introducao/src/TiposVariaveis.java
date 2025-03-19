public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short )numeroNormal;

        //variaveis x constantes

        int numero = 1;
        numero = 2;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // constantes -> escrever em caixa alta 
        //VALOR_DE_PI = 5; //não é permitido alterar
        System.out.println(VALOR_DE_PI);

        
    }
}
