//1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

public class Exercicio1 {
    public static void main(String[] args) {

        int[][] matriz = {{11,2,3,5},{20,30,20,1},{5,2,10,30},{3,4,5,1}};
        int contador = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(matriz[i][j] > 10){
                    contador++;
                }
            }
        }

        System.out.println("A matriz contém " +contador +" números maiores que 10");
    }
}
