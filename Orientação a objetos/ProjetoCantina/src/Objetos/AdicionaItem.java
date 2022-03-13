package Objetos;

import java.util.ArrayList;
import java.util.Objects;

public class AdicionaItem extends TaxaEntrega {
    ArrayList<String> itens = new ArrayList<>();
    ArrayList<Double> valores = new ArrayList<>();
    ArrayList<Integer> quantidadeItem = new ArrayList<>();
    private int contador;

    public int getContador() {
        return contador;
    }

    public void adicionaItem(String item, int quantidade, Double valor, int tipoTaxa) {
        int validaItemJaPedido = 1;
        Double valorTotal;
        for(int i = 0; i < this.contador; i++){
            if(Objects.equals(this.itens.get(i), item)){
                valorTotal = valor * quantidade;
                this.valores.set(i, this.valores.get(i) + valorTotal   );
                this.quantidadeItem.set(i, this.quantidadeItem.get(i) + quantidade);
                taxaEntrega(tipoTaxa, quantidade);
                validaItemJaPedido = 2;
            }
        }
        if(validaItemJaPedido == 1) {
            this.itens.add(item);
            this.quantidadeItem.add(quantidade);
            this.valores.add(quantidade * valor);
            taxaEntrega(tipoTaxa, quantidade);
            this.contador += 1;
        }
    }
}

