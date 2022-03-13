package Objetos;

import java.util.ArrayList;

public class AdicionaItem extends TaxaEntrega{
    ArrayList<String> itens = new ArrayList<>();
    ArrayList<Integer> valores = new ArrayList<>();
    ArrayList<Integer> quantidadeItem = new ArrayList<>();
    int contador;
    int total;

    public void adicionaItem(String item, int quantidade, int valor, int tipoTaxa){
        itens.add(item);
        quantidadeItem.add(quantidade);
        quantidade = valor * quantidade;
        valores.add(quantidade);
        taxaEntrega(tipoTaxa, quantidade);
        contador += 1;
    }
}
