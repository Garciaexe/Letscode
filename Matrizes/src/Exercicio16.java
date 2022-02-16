import java.util.Scanner;
//Fac ̧a um programa para corrigir uma prova com 10 questoes de multipla escolha (a, b, c, d ou e),
// em uma turma com 3 alunos. Cada questao vale 1 ponto. Leia o gabarito, e  ̃
//para cada aluno leia sua matricula (numero inteiro) e suas respostas. Calcule e escreva:  ́
//Para cada aluno, escreva sua matr ́ıcula, suas respostas, e sua nota. O percentual de aprovacao, assumindo media 7.0.

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] respostas = new char[3][10];
        char[] gabarito = new char[10];
        String[] aluno = new String[3];
        int[] matricula = new int[3];
        float aprovacao = 0;
        float percentual;
        float[] resultado = new float[3];

        //Criando gabartito:
        System.out.println("Gabarito:");
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a resposta da " + (i+1) + "° questão:");
            gabarito[i] = scan.next().charAt(0);
            while(gabarito[i] < 97 || gabarito[i] > 101){
                System.out.println("Valor inválido, digite a resposta da " + (i+1) + "° questão:");
                gabarito[i] = scan.next().charAt(0);
            }
        }
        //coletando resostas:
        for(int i = 0; i < 3; i++){
            System.out.println("\nReferente ao " + (i+1) + "° aluno, digite:");
            System.out.println("Nome:");
            aluno[i] = scan.next();
            System.out.println("Matricula:");
            matricula[i] = scan.nextInt();
            for(int j = 0; j < 10; j++){
                System.out.println("Resposta da " + (j+1) + "° questão:");
                respostas[i][j] = scan.next().charAt(0);
                while(respostas[i][j] < 97 || respostas[i][j] > 101){
                    System.out.println("Valor inválido, digite a respota da " + (j+1) + "° questão:");
                    respostas[i][j] = scan.next().charAt(0);
                }
            }
        }
        //Conferindo gabarito:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                if(respostas[i][j] == gabarito[j]){
                    resultado[i]++;
                }
            }
        }
        //Conferindo aprovação e conferindo respostas:
        for(int i = 0; i < 3; i++){
            if(resultado[i] >= 7){
                aprovacao = aprovacao + 10;
            }
            //Printando respostas:
            System.out.print("\nAluno: " + aluno[i] + "\nMatricula: " + matricula[i] + "\nResultado: ");
            for(int j = 0; j < 10; j++){
                System.out.print((j+1)+"° = "+respostas[i][j] + " ");
            }
            System.out.println("\nNota:" + resultado[i]);
        }
        percentual = (aprovacao / 30) * 100;
        System.out.printf("\nO percentual de aprovação é: %.2f",percentual);
        System.out.print("%");
    }
}
