class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    /**
     * Método implementado da interface AparelhoTelefonico que permite efeutar uma ligação
     */
    public Boolean ligar() {
        System.out.println("ligando");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }
    
    /**
     * Método implementado da interface AparelhoTelefonico que permite atender uma ligação
     */
    public Boolean atender() {
        System.out.println("atendendo");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }

    /**
     * Método implementado da interface AparelhoTelefonico que permite iniciar o correio de voz
     */
    public Boolean iniciarCorreioVoz() {
        System.out.println("iniciando o correio de voz");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }

    /**
     * Método implementado da interface NavegadorInternet que permite exibir uma página
     */
    public Boolean exibirPagina() {
        System.out.println("exibindo uma página");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }

    /**
     * Método implementado da interface NavegadorInternet que permite adicionar uma nova aba
     */
    public Boolean adicionarNovaAba() {
        System.out.println("adicionando uma nova aba");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }
    
    /**
     * Método implementado da interface NavegadorInternet que permite atualizar uma página
     */
    public Boolean atualizarPagina() {
        System.out.println("atualizando uma página");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }

    /**
     * Método implementado da interface ReprodutorMusical que permite tocar uma música
     */
    public Boolean tocar() {
        System.out.println("tocando uma música");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }

    /**
     * Método implementado da interface ReprodutorMusical que permite pausar uma música
     */
    public Boolean pausar() {
        System.out.println("pausando uma música");
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }

    /**
     * Método implementado da interface ReprodutorMusical que permite selecionar uma música
     */
    public Boolean selecionarMusica(String musica) {
        System.out.println("selecionando a música ".concat(musica));
        return true; // Poderíamos ter alguma lógica para definir se o retorno seria true ou false
    }
}