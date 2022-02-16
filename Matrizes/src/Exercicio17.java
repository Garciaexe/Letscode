import java.util.Scanner;

//Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva
//o numero de alunos cuja pior nota foi na prova 1, o n  ́ umero de alunos cuja pior nota foi  ́
//na prova 2, e o numero de alunos cuja pior nota foi na prova 3. Em caso de empate  ́
//das piores notas de um aluno, o criterio de desempate e arbitrario, mas o aluno deve ser  ́
//contabilizado apenas uma vez.

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[][] notas = new float[10][3];
        int[] piorNota = new int[3];

        //Lendo as notas:
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Nota do " + (i+1) + "° aluno na " + (j+1) + "° prova:");
                notas[i+1][j+1] = scan.nextFloat();
            }
        }
        //Contador e gambiarra de desempate:
        for(int i = 0; i < 10; i++){
                if(notas[i][0] == notas[i][1]){
                    notas[i][1] = 5000;
                }
                if(notas[i][0] == notas[i][2]){
                    notas[i][2] = 5000;
                }
                if(notas[i][1] == notas[i][2]){
                    notas[i][1] = 5000;
                }
                if(notas[i][0] < notas[i][1] && notas[i][0] < notas[i][2]){
                    piorNota[0]++;
                }
                if(notas[i][1] < notas[i][0] && notas[i][1] < notas[i][2]){
                    piorNota[1]++;
                }
                if (notas[i][2] < notas[i][0] && notas[i][2] < notas[i][1]){
                    piorNota[2]++;
                }
        }
        System.out.println(piorNota[0] + " alunos tiveram a menor nota na 1° prova.");
        System.out.println(piorNota[1] + " alunos tiveram a menor nota na 2° prova.");
        System.out.println(piorNota[2] + " alunos tiveram a menor nota na 3° prova.");
    }
}
