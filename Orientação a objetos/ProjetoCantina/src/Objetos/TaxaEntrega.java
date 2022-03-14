package Objetos;

import Interfaces.TaxaDeEntrega;

public class TaxaEntrega implements TaxaDeEntrega {
    private int taxa;
    private final int tipoTaxaUm = 1;
    private final int tipoTaxaDois = 2;

    public int getTaxa() {
        return taxa;
    }

    @Override
    public void taxaEntrega(int tipoTaxa, int quantidade) {
            if(tipoTaxa == 1){
                this.taxa += this.tipoTaxaUm * quantidade;
            }else if(tipoTaxa == 2){
                this.taxa += this.tipoTaxaDois * quantidade;
        }else{
                System.out.println("Tipo de taxa inválido");
            }
    }
}
