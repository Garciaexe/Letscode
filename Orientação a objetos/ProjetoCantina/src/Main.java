import Exceptions.ItemInexistenteException;
import Objetos.Menu;

public class Main {
    public static void main(String[] args) throws ItemInexistenteException {
        Menu menu = new Menu();
        System.out.println("\nSeja bem Vindo à Cantina Codifichiamo");
        menu.menu();
    }
}
