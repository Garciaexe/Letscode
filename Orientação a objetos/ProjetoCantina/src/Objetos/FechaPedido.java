package Objetos;

import java.util.ArrayList;

public class FechaPedido extends AdicionaItem{

    public void comanda(){
        System.out.println("\nSegue seu pedido:");
       for(int i = 0; i < this.contador; i++){
           System.out.println(this.quantidadeItem.get(i) + " - " + this.itens.get(i) + " " + this.valores.get(i) + "$");
           this.total += this.valores.get(i);
        }

        System.out.println("Taxa de entrega: " + getTaxa() + "$");
        this.total += getTaxa();

        System.out.println("Total do seu pedido: " + this.total + "$");

        System.out.println("\nObrigado pelo pedido – Conte conosco!");

        System.exit(0);
    }
}
