package Objetos;

import Exceptions.ItemInexistenteException;

import java.util.Scanner;

public class SelecionadorDePratos extends FechaPedido {
    Scanner scan = new Scanner(System.in);

    //Selecionador de pratos
    public void Selecionador() throws ItemInexistenteException {
        System.out.println("\nDigite o nome do item desejado:");
        String item = scan.nextLine().toLowerCase();
        System.out.println("Digite a quantidade desejada:");
        int quantidade = scan.nextInt();
        scan.nextLine();
        switch(item){
            case "burguer":
                adicionaItem(item, quantidade, 30.00, 1);
                break;
            case "pizza":
                adicionaItem(item, quantidade, 45.00, 1);
                break;
            case "fogazza":
                adicionaItem(item, quantidade, 20.00, 1);
                break;
            case "pasta":
                adicionaItem(item, quantidade, 30.00, 2);
                break;
            case "lasanha":
                adicionaItem(item, quantidade, 70.00, 2);
                break;
            case "polpetone":
                adicionaItem(item, quantidade, 50.00, 2);
                break;
            case "refrigerante":
                adicionaItem(item, quantidade, 5.00, 1);
                break;
            case "suco":
                adicionaItem(item, quantidade, 7.00, 1);
                break;
            case "vinho":
                adicionaItem(item, quantidade, 50.00, 1);
                break;
            default: throw new ItemInexistenteException("Item não encontrado");
        }
    }
}
