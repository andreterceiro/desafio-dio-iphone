public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Molejão");        
    }
}
