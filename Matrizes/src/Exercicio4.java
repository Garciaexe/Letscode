//Leia uma matriz 4 x 4, imprima a matriz e retorne a localizac ̧ao (linha e a coluna) do  ̃
//maior valor.
public class Exercicio4 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,5,3},{11,32,12,55},{10,21,22,33},{7,8,16,19}};
        int linha = 0;
        int coluna = 0;
        int valor = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0){
                    valor = matriz[i][j];
                }
                if(matriz[i][j] > valor){
                    valor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Linha: " + linha + "\nColuna:" + coluna);
    }
}
