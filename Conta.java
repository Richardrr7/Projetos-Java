import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Conta implements GerarNumeroAleatorio{
    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected static final Random random = new Random();
    protected static List<Conta> contasClientes = new ArrayList<Conta>();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado com sucesso");
    }
    public void depositar(double valor) {
        saldo += valor;

    }

    public void transferir(double valor, Conta conta) {
        saldo -= valor;
        conta.depositar(valor);
        System.out.println("Transferencia realizada com sucesso!");
    }
    public void exibirInfos(){
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
    }
    public void adicionarClienteLista(Conta conta){
        contasClientes.add(conta);
    }

    public static Conta procurarConta(int numeroConta){
        for(Conta conta : contasClientes){
            if(conta.getNumero() == numeroConta){
                return conta;
            }
        }
        return null;
    }

    @Override
    public int gerarNumero() {
        int numeroAleatorio;
        numeroAleatorio = random.nextInt(10000, 100000);
        return numeroAleatorio;

    }
    @Override
    public int gerarAgencia() {
        int agenciaAleatorio;
        agenciaAleatorio = random.nextInt(1000, 10000);
        return agenciaAleatorio;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
    return numero;
    }
    public static List<Conta> getContasClientes() {
        return contasClientes;
    }


}


