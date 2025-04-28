public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.saldo = 0;
        this.numero = gerarNumero();
        this.agencia = gerarAgencia();
    }

}
