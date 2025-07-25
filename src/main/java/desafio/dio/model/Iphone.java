package desafio.dio.model;

import desafio.dio.interfaces.AparelhoTelefonico;
import desafio.dio.interfaces.NavegadorInternet;
import desafio.dio.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica Selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o Numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada Aceita");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Checar Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina atual: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página, Aguarde.");
    }
}
