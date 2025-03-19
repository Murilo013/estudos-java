package Metodos;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv Ligada? : "+smartTV.ligada);
        System.out.println("Tv Canal: "+smartTV.canal);
        System.out.println("Tv Volume: "+smartTV.volume);

        smartTV.ligar();
        System.out.println("LIGANDO... Tv Ligada? : "+smartTV.ligada);

        smartTV.desligar();
        System.out.println("DESLIGANDO... Tv Ligada? : "+smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("AUMENTANDO VOLUME... Tv Volume: " +smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("DIMINUINDO VOLUME... Tv Volume: " +smartTV.volume);

        System.out.println("INSIRA NUMERO CANAL - >");
        smartTV.canal = sc.nextInt();

        smartTV.mudarCanal(smartTV.canal);

        System.out.println("CANAL ATUAL -> " + smartTV.canal);
    }
}
