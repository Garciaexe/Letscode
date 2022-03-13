package Objetos;

import Exceptions.ItemInexistenteException;

import java.util.Scanner;

public class SelecionadorDePratos extends FechaPedido {
    Scanner scan = new Scanner(System.in);
    private String item;
    private int quantidade;
    private int valor;

    //Selecionador de pratos
    public void Selecionador() throws ItemInexistenteException {
        System.out.println("\nDigite o nome do item desejado:");
        this.item = scan.nextLine().toLowerCase();
        System.out.println("Digite a quantidade desejada:");
        this.quantidade = scan.nextInt();
        scan.nextLine();
        switch(this.item){
            case "burguer":
                adicionaItem(this.item, this.quantidade, 30, 1);
                break;
            case "pizza":
                adicionaItem(this.item, this.quantidade, 45, 1);
                break;
            case "fogazza":
                adicionaItem(this.item, this.quantidade, 20, 1);
                break;
            case "pasta":
                adicionaItem(this.item, this.quantidade, 30, 2);
                break;
            case "lasanha":
                adicionaItem(this.item, this.quantidade, 70, 2);
                break;
            case "polpetone":
                adicionaItem(this.item, this.quantidade, 50, 2);
                break;
            case "refrigerante":
                adicionaItem(this.item, this.quantidade, 5, 1);
                break;
            case "suco":
                adicionaItem(this.item, this.quantidade, 7, 1);
                break;
            case "vinho":
                adicionaItem(this.item, this.quantidade, 50, 1);
                break;
            default: throw new ItemInexistenteException("Item não encontrado");
        }
    }
}
