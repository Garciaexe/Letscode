import java.util.Scanner;
//Faca um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule C = A ∗ B.
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        //Lendo as informações e calculando a terceira matriz.
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + " da 1° matriz:");
                matrizA[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + " da 2° matriz:");
                matrizB[i][j] = scan.nextInt();
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        //Printando matriz
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.printf("| %2d",matrizC[i][j]);
            }
        }
    }
}
