// Arquivo: iPhone.java
public class iPhone {
    private Reprodutor reprodutorMusical;
    private Telefone aparelhoTelefonico;
    private Navegador navegadorInternet;
    
    // Construtor
    public iPhone(Reprodutor reprodutorMusical, Telefone aparelhoTelefonico, Navegador navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    // Métodos de delegação

    // Reprodutor Musical
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void avancarMusica() {
        reprodutorMusical.avancar();
    }

    public void retrocederMusica() {
        reprodutorMusical.retroceder();
    }

    // Aparelho Telefônico
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void receberLigacao() {
        aparelhoTelefonico.receberLigacao();
    }

    public void encerrarLigacao() {
        aparelhoTelefonico.encerrarLigacao();
    }

    // Navegador de Internet
    public void abrirPagina(String url) {
        navegadorInternet.abrir(url);
    }

    public void fecharPagina() {
        navegadorInternet.fechar();
    }

    public void voltarPagina() {
        navegadorInternet.voltar();
    }

    public void avancarPagina() {
        navegadorInternet.avancar();
    }

    public void buscarNaInternet(String termo) {
        navegadorInternet.buscar(termo);
    }
}