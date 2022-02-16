import java.util.Random;

//Fac ̧a um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de  ́
//bingo. Sabendo que cada cartela devera conter 5 linhas de 5 n  ́ umeros, gere estes dados  ́
//de modo a nao ter n  ̃ umeros repetidos dentro das cartelas. O programa deve exibir na  ́
//tela a cartela gerada.
public class Exercicio14 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[5][5];

        //Gambiarra caso contrário nunca iria preencher com 0
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = 1;
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = aleatorio.nextInt(100);
                for(int x = 0; x < 5; x++){
                    for(int y = 0; y < 5; y++){
                        if (matriz[i][j] == matriz[x][y]){
                            matriz[i][j] = aleatorio.nextInt(100);
                        }
                    }
                }
            }
        }

        System.out.print("Cartela criada:");
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                System.out.printf("| %2d", matriz[i][j]);
            }
        }
    }
}
