import java.util.Scanner;
//Leia uma matriz 5 x 10 que se refere respostas de 10 questoes de m  ̃ ultipla escolha,  ́
//referentes a 5 alunos. Leia tambem um vetor de 10 posic ̧  ́ oes contendo o gabarito de  ̃
//respostas que podem ser a, b, c ou d. Seu programa devera comparar as respostas  ́
//de cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a
//pontuac ̧ao correspondente a cada aluno.

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] respostas = new char[5][10];
        char[] gabarito = new char[10];
        String[] aluno = new String[5];
        int[] resultado = new int[5];

        //Criando gabartito:
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a resposta da " + (i+1) + "° questão:");
            gabarito[i] = scan.next().charAt(0);
            while(gabarito[i] < 97 || gabarito[i] > 100){
                System.out.println("Valor inválido, digite a resposta da " + (i+1) + "° questão:");
                gabarito[i] = scan.next().charAt(0);
            }
        }
        //coletando resostas:
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do " + (i+1) + "° aluno:");
            aluno[i] = scan.next();
            for(int j = 0; j < 10; j++){
                System.out.println("Digite a resposta da " + (j+1) + "° questão:");
                respostas[i][j] = scan.next().charAt(0);
                while(respostas[i][j] < 97 || respostas[i][j] > 100){
                    System.out.println("Valor inválido, digite a respota da " + (j+1) + "° questão:");
                    respostas[i][j] = scan.next().charAt(0);
                }
            }
        }
        //Conferindo gabarito:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                if(respostas[i][j] == gabarito[j]){
                    resultado[i]++;
                }
            }
        }
        //Printando respostas:
        for(int i = 0; i < 5; i++){
            System.out.println("O aluno " + aluno[i] + " acertou " + resultado[i] + " questões." );
        }
    }
}
