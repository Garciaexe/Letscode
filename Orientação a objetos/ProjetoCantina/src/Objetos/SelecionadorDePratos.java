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
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.quantidade = 30 * this.quantidade;
                valores.add(this.quantidade);
                taxaEntrega(1, this.quantidade);
                contador += 1;
                break;
            case "pizza":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 45 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(1, this.quantidade);
                contador += 1;
                break;
            case "fogazza":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 20 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(1, this.quantidade);
                contador += 1;
                break;
            case "pasta":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 30 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(2, this.quantidade);
                contador += 1;
                break;
            case "lasanha":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 70 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(2, this.quantidade);
                contador += 1;
                break;
            case "polpetone":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 50 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(2, this.quantidade);
                contador += 1;
                break;
            case "refrigerante":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 5 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(1, this.quantidade);
                contador += 1;
                break;
            case "suco":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 7 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(1, this.quantidade);
                contador += 1;
                break;
            case "vinho":
                itens.add(item);
                quantidadeItem.add(this.quantidade);
                this.valor = 50 * this.quantidade;
                valores.add(this.valor);
                taxaEntrega(1, this.quantidade);
                contador += 1;
                break;
            default: throw new ItemInexistenteException("Item não encontrado");
        }
    }
}
