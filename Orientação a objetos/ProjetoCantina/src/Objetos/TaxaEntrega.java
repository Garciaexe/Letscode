package Objetos;

import Interfaces.TaxaDeEntrega;

public class TaxaEntrega implements TaxaDeEntrega {
    private int taxa;

    public int getTaxa() {
        return taxa;
    }

    @Override
    public void taxaEntrega(int tipotaxa, int quantidade) {
        if(tipotaxa == 1){
            this.taxa += tipotaxa * quantidade;
        }
        if(tipotaxa == 2){
            this.taxa += tipotaxa * quantidade;
        }
    }
}
