import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][6];
        int somaImpar = 0;
        int media = 0;

        //lendo valores:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 6; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ":");
                matriz[i][j] = scan.nextInt();
            }
        }

        //Somando valores dos elementos das colunas impares:
        for(int i = 0; i < 3; i++){
            for(int j = 1; j < 6; j = j + 2){
                somaImpar = somaImpar + matriz[i][j];
            }
        }
        //média dos valores da segunda e quarta coluna
        for(int i = 0; i < 3; i++){
            for(int j = 1; j < 4; j = j + 1){
                media = media + matriz[i][j];
            }
        }
        media = media/6;

        //Substitindo os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
        for(int i = 0; i < 3; i++){
            matriz[i][5] = matriz[i][1] + matriz[i][2];
        }

        //printando resultados:
        System.out.println("A soma dos valores das colunas ímpares é: " + somaImpar);
        System.out.println("A média dos valores da segunda e quarta coluna é: " + media);
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 6; j++){
                System.out.printf("| %2d", matriz[i][j]);
            }
        }
        System.out.println();
    }
}
