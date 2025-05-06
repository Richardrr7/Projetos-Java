public class PushNotificacao implements NotificacaoStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando Push : " + mensagem);
    }
}
