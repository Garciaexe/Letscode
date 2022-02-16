import java.util.Scanner;

//Leia uma matriz 5 x 5. Leia tambem um valor  ́ X. O programa devera fazer uma busca  ́
//desse valor na matriz e, ao final, escrever a localizac ao (linha e coluna) ou uma mensa-  ̃
//gem de “nao encontrado”.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int linha = 0;
        int coluna = 0;
        int numeroEncontrado = 0;
        int valor;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ":");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("Digite o número que gostaria de buscar na matriz:");
        valor = scan.nextInt();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(matriz[i][j] == valor){
                    coluna = i + 1;
                    linha = j + 1;
                    numeroEncontrado = 1;
                }
            }
        }

        if(numeroEncontrado == 0){
            System.out.println("Não encontrado");
        }else{
            System.out.println("O valor " + valor + " foi localizado na linha " + linha + " coluna " + coluna);
        }
    }
}
