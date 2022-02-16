import java.util.Scanner;

//Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posic ̧ao ̃
//das matrizes lidas.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + " da primeira matriz:");
                matrizA[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + " da segunda matriz:");
                matrizB[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(matrizA[i][j] < matrizB[i][j]){
                    matrizC[i][j] = matrizA[i][j];
                }else{
                    matrizC[i][j] = matrizB[i][j];
                }
            }
        }
        System.out.println("O resultado é:");
        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                System.out.print(" " + matrizC[i][j]);
            }
        }
    }
}
