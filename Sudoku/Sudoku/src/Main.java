import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            tab.mostrarTabuleiro(tab.tabuleiro);

            System.out.println("Digite a linha (0 - 8): ");
            int linha = scanner.nextInt() - 1;

            System.out.println("Digite a coluna (0 - 8): ");
            int coluna = scanner.nextInt() - 1;

            System.out.println("Digite o número (1 - 9)");
            int numero = scanner.nextInt();

            if(tab.podeColocar(linha, coluna, numero)){
                tab.tabuleiro[linha][coluna] =  numero;

                if (tab.verificarVitoria()) {
                    tab.mostrarTabuleiro(tab.tabuleiro);
                    System.out.println("Jogo concluído com sucesso! PARABÉNS!!!");
                    break;
                }
            }
            else{
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
    }
}