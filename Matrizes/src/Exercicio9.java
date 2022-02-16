import java.util.Scanner;

//Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da  ̃
//diagonal principal.
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int resultado = 0;

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j + 1) + ":");
                matriz[i][j] = scan.nextInt();
                if(i > j){
                    resultado = resultado + matriz[i][j];
                }
            }
        }
        System.out.println("O resultado é: " + resultado);
    }
}
