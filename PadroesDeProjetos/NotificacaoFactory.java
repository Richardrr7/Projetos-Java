public class NotificacaoFactory {
    public static NotificacaoStrategy create(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotificacao();
            case "sms":
                return new SmsNotificacao();
            case "push":
                return new PushNotificacao();
            default:
                throw new IllegalArgumentException("Tipo inválido de notificação: " + tipo);
        }
    }
}
