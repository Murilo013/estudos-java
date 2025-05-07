public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void ligarIphone(){
        System.out.println("LIGANDO IPHONE...");
    }

    public void desligar(){
        System.out.println("DESLIGANDO IPHONE...");
    }


    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("tocando -> " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para -> " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("gravando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo página -> " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("página atualizada");
    }
}
