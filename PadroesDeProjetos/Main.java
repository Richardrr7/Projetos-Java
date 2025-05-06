public class Main {
    public static void main(String[] args) {
        ServicoDeNotificacao servico = ServicoDeNotificacao.getInstance();

        NotificacaoStrategy email = NotificacaoFactory.create("email");
        servico.setStrategy(email);
        servico.notificar("Bem-vindo, Richard");

        NotificacaoStrategy sms = NotificacaoFactory.create("sms");
        servico.setStrategy(sms);
        servico.notificar("Código de verificação: 123456");

        NotificacaoStrategy push = NotificacaoFactory.create("push");
        servico.setStrategy(push);
        servico.notificar("Você tem uma nova mensagem.");
    }
}
