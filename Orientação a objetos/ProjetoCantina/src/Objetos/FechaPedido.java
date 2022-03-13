package Objetos;


public class FechaPedido extends AdicionaItem{
    int total;

    public void comanda(){
        System.out.println("\nSegue seu pedido:");
       for(int i = 0; i < getContador(); i++){
           System.out.println(this.quantidadeItem.get(i) + " - " + itens.get(i) + " " + valores.get(i) + "$");
           this.total += this.valores.get(i);
        }

        System.out.println("Taxa de entrega: " + getTaxa() + "$");
        this.total += getTaxa();

        System.out.println("Total do seu pedido: " + this.total + "$");

        System.out.println("\nObrigado pelo pedido – Conte conosco!");

        System.exit(0);
    }
}
