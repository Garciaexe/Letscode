import java.util.Scanner;

public class CriadorLampadaIncandescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LampadaFluorescente lampada = new LampadaFluorescente();
        int decisao = 1;
        //Par para desligado e impar para ligado
        int statusLampada;

        //Ao invés de implementar uma função para validar se o usuário está tentando ligar uma lampada ligada ou desligar uma lampda desligada
        //Preferi limitar o código a ação do interruptor, onde já é realizada a validação de a lampada está ligada ou não, a logica é a mesma...
        System.out.println("Digite 0 se a lampada estiver desligada ou 1 se estiver ligada");
        statusLampada = scan.nextInt();

        while (decisao < 2 || decisao > 2) {
            System.out.println();
            System.out.println("Digite 1 para apertar o interruptor ou 2 para ir dormir");
            decisao = scan.nextInt();
            if (decisao == 1){
                if(statusLampada % 2 == 0){
                    lampada.liga();
                }
                if(statusLampada % 2 > 0){
                    lampada.desliga();
                }
            }
            statusLampada++;

            if (decisao == 2) {
                System.out.println("Boa noite!");
            }
            if (decisao > 2 || decisao < 1){
                System.out.println("Opção errada, digite novamente");
            }
        }
    }
}
