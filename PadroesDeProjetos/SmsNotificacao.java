public class SmsNotificacao implements NotificacaoStrategy {
    public void enviar(String mensagem) {
        System.out.println(("Enviando SMS : " + mensagem));
    }
}
