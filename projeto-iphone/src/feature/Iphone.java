package feature;

import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public String ligar() {
        return "Ligando do Iphone";
    }

    public void atender() {
        System.out.println("atendendo do Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone");
    }

    public String exibirPagina() {
        return "Exibindo página pelo Iphone";
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba ao navegador do Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página pelo Iphone");
    }

    public void tocar() {
        System.out.println("tocando música pelo Iphone");
    }

    public void pausar() {
        System.out.println("Pausando música pelo Iphone");
    }

    public String selecionarMusica() {
        return "Selecionando Música pelo Iphone";
    }
}
