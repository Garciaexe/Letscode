import Exceptions.ItemInexistenteException;
import Objetos.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ItemInexistenteException {
        Scanner scan = new Scanner(System.in);
        int opcao = 3;
        Menu menu = new Menu();

        System.out.println("\nSeja bem Vindo à Cantina Codifichiamo");

        //Menu de opções
        while (opcao < 4) {
            menu.menu();
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:
                    menu.listarPratos();
                    break;
                case 2:
                    menu.Selecionador();
                    break;
                case 3:
                    menu.comanda();
                    break;
            }
        }
    }
}
