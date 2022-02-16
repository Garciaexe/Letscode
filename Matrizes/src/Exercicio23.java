import java.util.Scanner;
//Faca um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A2
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        //lendo os valores e calculando a segunda matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ":");
                matrizA[i][j] = scan.nextInt();
                matrizB[i][j] = matrizA[i][j] * matrizA[i][j];
            }
        }
        //Printando matriz;
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.printf("| %2d", matrizB[i][j]);
            }
        }
    }
}
