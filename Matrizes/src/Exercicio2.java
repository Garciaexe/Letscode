//Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
//elementos. Escreva ao final a matriz obtida.

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}};

        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                System.out.print(" " +matriz[i][j]);
            }
        }
    }
}
