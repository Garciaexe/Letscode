package Objetos;

import java.util.ArrayList;

public class AdicionaItem extends TaxaEntrega {
    ArrayList<String> itens = new ArrayList<>();
    ArrayList<Integer> valores = new ArrayList<>();
    ArrayList<Integer> quantidadeItem = new ArrayList<>();
    private int contador;

    public int getContador() {
        return contador;
    }


    public void adicionaItem(String item, int quantidade, int valor, int tipoTaxa) {
                this.itens.add(item);
                this.quantidadeItem.add(quantidade);
                this.valores.add(quantidade * valor);
                taxaEntrega(tipoTaxa, quantidade);
                this.contador += 1;

    }
}

