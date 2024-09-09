import aparelhotelefonico.AparelhoTelefonico;
import feature.Iphone;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();


        NavegadorInternet safari = iphone;
        AparelhoTelefonico telefone = iphone;
        ReprodutorMusical ipode = iphone;

        System.out.println("\n ==== Funções de Navegador no Iphone ==== \n");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
        System.out.println(safari.exibirPagina());

        System.out.println("\n ==== Funções de Telefone no Iphone ==== \n");
        System.out.println(telefone.ligar());
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("\n ==== Funções de Reprodutor de Música no Iphone ==== \n");
        ipode.tocar();
        ipode.pausar();
        System.out.println(ipode.selecionarMusica());

    }
}