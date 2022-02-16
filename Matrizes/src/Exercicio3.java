//Fac ̧a um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
//coluna de cada elemento. Em seguida, imprima na tela a matriz.
public class Exercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = i * j;
            }
        }

        for(int elementos[] : matriz){
            System.out.println();
            for(int elemento : elementos){
                System.out.print(" " + elemento);
            }
        }

    }
}
