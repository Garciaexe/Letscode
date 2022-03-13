package Objetos;

import java.util.ArrayList;

public class AdicionaItem extends TaxaEntrega{
    ArrayList<String> itens = new ArrayList<>();
    ArrayList<Integer> valores = new ArrayList<>();
    ArrayList<Integer> quantidadeItem = new ArrayList<>();
    int contador;
    int total;
    int quantidadeDefault;

    public void adicionaItem(String item, int quantidade, int valor, int tipoTaxa){
        this.itens.add(item);
        this.quantidadeItem.add(quantidade);
        this.quantidadeDefault = quantidade;
        quantidade = valor * quantidade;
        this.valores.add(quantidade);
        taxaEntrega(tipoTaxa, this.quantidadeDefault);
        this.contador += 1;
    }
}
