import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizSoma = new int[2][2];
        int[][] matrizSubtracao = new int[2][2];
        int escolha = 0;
        int escolhaRep = 0;
        int constante = 0;

        //lendo a matriz
        for(int i = 0; i < 2; i++){
            for(int j =0; j < 2; j++){
                System.out.println("Informe o valor da linha " + (i+1) + " coluna " + (j+1) + " da 1° matriz:");
                matrizA[i][j] = scan.nextInt();
                System.out.println("Informe o valor da linha " + (i+1) + " coluna " + (j+1) + " da 2° matriz:");
                matrizB[i][j] = scan.nextInt();
            }
        }
        //escolhendo e aplicando opções;
        while(escolhaRep == 0) {
            System.out.println("Digite:");
            System.out.println("1 para somar as matrizes");
            System.out.println("2 para subtrair as matrizes");
            System.out.println("3 para adicionar uma constante a matriz");
            System.out.println("4 para imprimir as matrizes");
            escolha = scan.nextInt();
            if(escolha < 1 || escolha > 4){
                System.out.println("Opção invalida, digite novamente");
                escolha = scan.nextInt();
            }
            if(escolha == 1){
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }
            }
            if(escolha == 2){
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        matrizSubtracao[i][j] = matrizA[i][j] * matrizB[i][j];
                    }
                }
            }
            if(escolha == 3){
                System.out.println("Digite a constante:");
                constante = scan.nextInt();
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        matrizA[i][j] = matrizA[i][j] + constante;
                        matrizB[i][j] = matrizB[i][j] + constante;
                    }
                }
            }
            if(escolha == 4){
                System.out.println("Matriz 1:");
                for(int i = 0; i < 2; i++){
                    System.out.println();
                    for(int j = 0; j < 2; j++){
                        System.out.printf("| %2d", matrizA[i][j]);
                        System.out.println();
                    }
                }
                System.out.println("Matriz 2:");
                for(int i = 0; i < 2; i++){
                    System.out.println();
                    for(int j = 0; j < 2; j++){
                        System.out.printf("| %2d", matrizB[i][j]);
                        System.out.println();
                    }
                }
                if((matrizSoma[0][0] * matrizSoma[1][1]) > 0){
                    System.out.println("Resultado da soma:");
                    for(int i = 0; i < 2; i++){
                        System.out.println();
                        for(int j = 0; j < 2; j++){
                            System.out.printf("| %2d", matrizSoma[i][j]);
                            System.out.println();
                        }
                    }
                }
                if((matrizSubtracao[0][0] * matrizSubtracao[1][1]) > 0){
                    System.out.println("Resultado da subtração:");
                    for(int i = 0; i < 2; i++){
                        System.out.println();
                        for(int j = 0; j < 2; j++){
                            System.out.printf("| %2d", matrizSoma[i][j]);
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println("Digite 0 para escolher nova opção ou 1 finalizar:");
            escolhaRep = scan.nextInt();
        }
    }
}