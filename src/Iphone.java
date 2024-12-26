class ReprodutorMusical {
    void tocar() {
        System.out.println("Reproduzindo música...");
    }

    void pausar() {
        System.out.println("Música pausada.");
    }

    void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}

class AparelhoTelefonico {
    void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    void atender() {
        System.out.println("Chamada atendida.");
    }

    void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}

class NavegadorNaInternet {
    void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

class DispositivoMultifuncional {
    private final ReprodutorMusical reprodutorMusical;
    private final AparelhoTelefonico aparelhoTelefonico;
    private final NavegadorNaInternet navegadorNaInternet;

    public DispositivoMultifuncional() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorNaInternet = new NavegadorNaInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorNaInternet getNavegadorNaInternet() {
        return navegadorNaInternet;
    }
}

public class Main {
    public static void main(String[] args) {
        DispositivoMultifuncional dispositivo = new DispositivoMultifuncional();

        // Testando funcionalidades do Reprodutor Musical
        dispositivo.getReprodutorMusical().selecionarMusica("Imagine - John Lennon");
        dispositivo.getReprodutorMusical().tocar();
        dispositivo.getReprodutorMusical().pausar();

        // Testando funcionalidades do Aparelho Telefônico
        dispositivo.getAparelhoTelefonico().ligar("123-456-7890");
        dispositivo.getAparelhoTelefonico().atender();
        dispositivo.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando funcionalidades do Navegador na Internet
        dispositivo.getNavegadorNaInternet().exibirPagina("https://www.exemplo.com");
        dispositivo.getNavegadorNaInternet().adicionarNovaAba();
        dispositivo.getNavegadorNaInternet().atualizarPagina();
    }
}
