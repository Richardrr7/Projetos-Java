public class ServicoDeNotificacao {
    private static ServicoDeNotificacao instance;
    private NotificacaoStrategy strategy;

    private ServicoDeNotificacao() {}

    public static ServicoDeNotificacao getInstance() {
        if (instance == null) {
            instance = new ServicoDeNotificacao();
        }
        return instance;
    }

    public void setStrategy(NotificacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void notificar(String mensagem) {
        if (strategy == null) {
            throw new IllegalStateException("Estratégia de notificação não definida.");
        }
        strategy.enviar(mensagem);
    }
}
