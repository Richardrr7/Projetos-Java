public class Tabuleiro {

    public Tabuleiro() {

    }

    int[][] tabuleiro = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public static void mostrarTabuleiro(int[][] tabuleiro) {
        for (int i = 0; i < 9; i++){
            if(i%3 == 0 && i != 0){
                System.out.print("------+-------+------");
                System.out.println();
            }
            for (int j = 0; j < 9; j++){
                if(j%3 == 0 && j != 0){
                    System.out.print("| ");
                }
                if (tabuleiro[i][j] == 0){
                    System.out.print(". ");
                }
                else{
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean podeColocar(int linha,  int coluna, int numero ){
        for (int i = 0; i < 9; i++){
            if(tabuleiro[linha][i] == numero){
                return false;
            }
        }
        for (int i = 0; i < 9; i++){
            if(tabuleiro[i][coluna] == numero){
                return false;
            }
        }
        int inicioLinha = linha - linha % 3;
        int inicioColuna = coluna - coluna % 3;

        for (int i = inicioLinha; i < inicioLinha + 3; i++){
            for (int j = inicioColuna; j < inicioColuna + 3; j++){
                if (tabuleiro[i][j] == numero){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verificarVitoria(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tabuleiro[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
