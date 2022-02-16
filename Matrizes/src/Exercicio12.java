import java.util.Scanner;

//Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int resultado = 0;

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j + 1) + ":");
                matrizA[i][j] = scan.nextInt();
                matrizB[j][i] = matrizA[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.print(" " + matrizB[i][j]);
            }
        }
    }
}
