import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opcao = 1;
        Conta contaTeste = new Conta(new Cliente("Carlinhos"));
        Scanner ler = new Scanner(System.in);

        while (opcao != 0){
            System.out.println("-------BANCO DIGITAL-------");
            System.out.println("1- Criar conta corrente");
            System.out.println("2- Criar conta poupança");
            System.out.println("3- Efetuar Deposito.");
            System.out.println("4- Efetuar Saque.");
            System.out.println("5- Efetuar Transferencia.");
            System.out.println("6- Ver informações da conta.");
            System.out.println("7- Sair.");
            System.out.println("Digite uma opcao: ");


            opcao = ler.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Preencha as informações abaixo:");
                    System.out.println();
                    System.out.println("Nome do Cliente: ");
                    String nomeCorrente = ler.next();

                    Conta corrente = new ContaCorrente(new Cliente(nomeCorrente));
                    System.out.println("Conta corrente criada com sucesso!");
                    corrente.adicionarClienteLista(corrente);
                    corrente.exibirInfos();
                    break;

                case 2:
                    System.out.println("Preencha as informações abaixo:");
                    System.out.println();
                    System.out.println("Nome do Cliente: ");
                    String nomePoupanca = ler.next();

                    Conta poupanca = new ContaPoupanca(new Cliente(nomePoupanca));
                    System.out.println("Conta poupança criada com sucesso!");
                    poupanca.adicionarClienteLista(poupanca);
                    poupanca.exibirInfos();
                    break;

                case 3:
                    System.out.println("Digite o número da conta: ");
                    int numeroContaDeposito = ler.nextInt();

                    Conta contaDeposito = Conta.procurarConta(numeroContaDeposito);

                    if (contaDeposito != null){
                        System.out.println("Insira o valor para depósito:");
                        double valor = ler.nextDouble();
                        contaDeposito.depositar(valor);
                        System.out.println("Depísito realizado com sucesso!");
                    }
                    else{
                        System.out.println("Conta não encontrada!");
                    }
                    break;



                case 4:
                    System.out.println("Digite o número da conta: ");
                    int numeroSaque = ler.nextInt();

                    Conta contaSaque = Conta.procurarConta(numeroSaque);

                    if(contaSaque != null){
                        System.out.println("Insira o valor para saque:");
                        double valor = ler.nextDouble();
                        contaSaque.sacar(valor);
                    }
                    else{
                        System.out.println("Conta não encontrada!");
                    }
                    break;



                case 5:
                    System.out.println("Insira o numero da conta: ");
                    int numeroTransferencia = ler.nextInt();

                    Conta contaTransferencia = Conta.procurarConta(numeroTransferencia);

                    if(contaTransferencia != null){
                        System.out.println("Insira o valor para realizar a transferência: ");
                        double saldo = ler.nextDouble();
                        contaTransferencia.transferir(saldo, contaTeste);

                    }
                    else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 6:
                    System.out.println("Insira o numero da conta: ");
                    int numeroConta = ler.nextInt();

                    Conta conta = Conta.procurarConta(numeroConta);
                    if(conta != null){
                        conta.exibirInfos();
                    }
                    else{
                        System.out.println("Conta inexistente!");
                    }
                    break;

                case 7:
                    System.out.println("Fechando o sistema do Banco Digital.");
                    opcao = 0;
                    break;


                default:
                    System.out.println("Escolha uma altenativa existente.");
                    break;
            }
        }
        ler.close();
    }
}