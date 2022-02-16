import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][4];
        int maiorNota = 0;
        int media = 0;

        //lendo informações:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(j == 0){
                    System.out.println("Digite a matricula do " + (i+1) + "° aluno:");
                    matriz[i][j] = scan.nextInt();
                }
                if(j == 1){
                    System.out.println("Digite a média das provas do " + (i+1) + "° aluno:");
                    matriz[i][j] = scan.nextInt();
                }
                if(j == 2){
                    System.out.println("Digite a média dos trabalhos do " + (i+1) + "° aluno:");
                    matriz[i][j] = scan.nextInt();
                }
            }
        }

        //Calculando média final e o aluno com maior média:
        for(int i = 0; i < 5; i++){
            matriz[i][3] = matriz[i][1] + matriz[i][2];
            if(maiorNota < matriz[i][3]){
                maiorNota = matriz[i][0];
            }
            media = media + matriz[i][3];
        }
        media = media / 5;

        //Exibindo resultados;
        System.out.println("A matricula do aluno com maior nota final é: " + maiorNota);
        System.out.println("A média aritmética das notas é: " + media);
     }
}
