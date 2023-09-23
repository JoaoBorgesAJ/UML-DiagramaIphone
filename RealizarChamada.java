public interface RealizarChamada {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
    void enviarMensagem(String numero, String mensagem);
    void receberMensagem(String numero, String mensagem);
}
