import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

       Iphone iphone = new Iphone();

       //PADRÃO
       iphone.ligarIphone();

       //REPRODUTOR MUSICAL
        System.out.println("-------- REPRODUTOR MUSICAL ----------");
       iphone.tocar();
       iphone.pausar();
       iphone.selecionarMusica("Yellow");


       //NAVEGADOR INTERNET
        System.out.println("-------- NAVEGADOR INTERNET ----------");
        iphone.exibirPagina("youtube");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //APARELHO TELEFONICO
        System.out.println("-------- APARELHO TELEFONICO ----------");
        iphone.ligar("101010101010");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //PADRÃO
        iphone.desligar();
    }
}