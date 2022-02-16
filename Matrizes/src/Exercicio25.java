import java.util.Random;
import java.util.Scanner;

//Fac ̧a um programa para determinar a proxima jogada em um Jogo da Velha. Assumir que  ́
//o tabuleiro e representado por uma matriz de 3 x 3, onde cada posic ̧  ́ ao representa uma  ̃ das casas do tabuleiro. A matriz pode conter os seguintes valores -1, 0, 1 representando
//respectivamente uma casa contendo uma pec ̧a minha (-1), uma casa vazia do tabuleiro (0), e uma casa contendo uma pec ̧a do meu oponente (1).
//Exemplo:
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[][] matriz = {{0,0,0},{0,0,0},{0,0,0}};
        int a = 0;
        int b = 0;
        int fimDeJogo = 0;
        String ganhador = "a";


        while(fimDeJogo == 0){
            for(int i = 0; i < 3; i++){
                System.out.println();
                for(int j = 0; j < 3; j++){
                    System.out.printf("| %1d", matriz[i][j]);
                }
            }
            System.out.println();

            System.out.println("Digite a sua jogada");
            System.out.println("Linha:");
            a = scan.nextInt();
            if(a > 2 && a < 0){
                System.out.println("Comando inválido, digite a linha novamente:");
                a = scan.nextInt();
            }
            System.out.println("Coluna:");
            b = scan.nextInt();
            if(b > 2 && b < 0){
                System.out.println("Comando inválido, digite a coluna novamente:");
                b = scan.nextInt();
            }
            matriz[a][b] = -1;

            if(matriz[0][0] == -1 && matriz [0][1] == -1 && matriz[0][2] == -1){
                fimDeJogo = 1;
                ganhador = "Você ganhou";
            }
            if(matriz[1][0] == -1 && matriz [1][1] == -1 && matriz[1][2] == -1){
                fimDeJogo = 1;
                ganhador = "Você ganhou";
            }
            if(matriz[2][0] == -1 && matriz [2][1] == -1 && matriz[2][2] == -1){
                fimDeJogo = 1;
                ganhador = "Você ganhou";
            }
            if(matriz[0][0] == -1 && matriz [1][1] == -1 && matriz[2][2] == -1){
                fimDeJogo = 1;
                ganhador = "Você ganhou";
            }
            if(matriz[0][2] == -1 && matriz [1][1] == -1 && matriz[2][0] == -1){
                fimDeJogo = 1;
                ganhador = "Você ganhou";
            }

            if(matriz[a][b] != 0){
                a = rand.nextInt(3);
                b = rand.nextInt(3);
            }
            matriz[a][b] = 1;

            if(matriz[0][0] == 1 && matriz [0][1] == 1 && matriz[0][2] == 1){
                fimDeJogo = 1;
                ganhador = "Você perdeu";
            }
            if(matriz[1][0] == 1 && matriz [1][1] == 1 && matriz[1][2] == 1){
                fimDeJogo = 1;
                ganhador = "Você ganhou";
            }
            if(matriz[2][0] == 1 && matriz [2][1] == 1 && matriz[2][2] == 1){
                fimDeJogo = 1;
                ganhador = "Você perdeu";
            }
            if(matriz[0][0] == 1 && matriz [1][1] == 1 && matriz[2][2] == 1){
                fimDeJogo = 1;
                ganhador = "Você perdeu";
            }
            if(matriz[0][2] == 1 && matriz [1][1] == 1 && matriz[2][0] == 1){
                fimDeJogo = 1;
                ganhador = "Você perdeu";
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.printf("| %1d", matriz[i][j]);
            }
        }
        System.out.println(ganhador);
    }
}
