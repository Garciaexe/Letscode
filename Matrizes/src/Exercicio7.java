public class Exercicio7 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i < j){
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                }
                if(i == j){
                    matriz[i][j] = (3 * i) * (3 * i) - 1;
                }
                if(i > j){
                    matriz[i][j] = ((4 * i) * (4 * i) * (4 * i)) - ((5 * j) * (5 * j)) + 1;
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println();
            for(int j = 0; j < 10; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }
    }
}
