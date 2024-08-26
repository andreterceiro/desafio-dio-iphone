interface AparelhoTelefonico {
    /**
     * Permite efeutar uma ligação
     */
    public Boolean ligar();

    /**
     * Permite atender uma ligação
     */
    public Boolean atender();

    /**
     * Permite iniciar o correio de voz
     */
    public Boolean iniciarCorreioVoz();
}