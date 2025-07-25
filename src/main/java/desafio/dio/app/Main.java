package desafio.dio.app;

import desafio.dio.model.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("99 9999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
