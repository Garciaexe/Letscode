package Objetos;

import Interfaces.TaxaDeEntrega;

public class TaxaEntrega implements TaxaDeEntrega {
    private int taxa;

    public int getTaxa() {
        return taxa;
    }

    @Override
    public void taxaEntrega(int tipotaxa, int quantidade) {
            this.taxa += tipotaxa * quantidade;
    }
}
