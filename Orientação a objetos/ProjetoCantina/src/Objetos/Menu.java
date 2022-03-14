package Objetos;

import Exceptions.ItemInexistenteException;

import java.util.Scanner;

public class Menu extends Opcoes {
    Scanner scan = new Scanner(System.in);
    private int opcao = 3;

    public void menu() throws ItemInexistenteException {
        while (opcao < 4) {
            mostrarOpcoes();
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1:
                    listarPratos();
                    break;
                case 2:
                    Selecionador();
                    break;
                case 3:
                    comanda();
                    break;
            }

        }

    }
}