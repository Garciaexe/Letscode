import java.util.Random;

//Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme
//a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os ele-mentos acima da diagonal principal.
// Imprima a matriz original e a matriz transformada.

public class Exercicio13 {
    public static void main(String[] args) {
        Random randomico = new Random();
        int[][] matriz = new int[4][4];


        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                while(matriz[i][j] == 0){
                    matriz[i][j] = randomico.nextInt(20);
               }
            }
        }

        System.out.print("Matriz original:");
        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i < j){
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.print("\n\nMatriz transformada:");
        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }
    }
}
