public class ContaCorrente extends Conta{

    public ContaCorrente (Cliente cliente) {
        super(cliente);
        this.saldo = 0;
        this.numero = gerarNumero();
        this.agencia = gerarAgencia();

    }

}
