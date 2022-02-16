import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];

        //Lendo os valores:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ":");
                matriz[i][j] = scan.nextInt();
            }
        }

        //Montando o vetor:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
             vetor[i] = vetor[i] + matriz[j][i];
            }
        }

        //Escrevendo o resultado:
        for(int i = 0; i < 3; i++){
            System.out.println("Resultado:");
            System.out.print(" " + vetor[i]);
        }
    }

}
