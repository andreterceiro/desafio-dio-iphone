interface ReprodutorMusical {
    /**
     * Permite tocar uma música
     */    
    public Boolean tocar();

    /**
     * Permite pausar uma música
     */
    public Boolean pausar();
    
    /**
     * Permite selecionar uma música
     */    
    public Boolean selecionarMusica(String musica);
}