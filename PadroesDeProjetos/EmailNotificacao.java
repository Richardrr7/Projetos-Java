public class EmailNotificacao implements NotificacaoStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando Email : " + mensagem);
    }
}
