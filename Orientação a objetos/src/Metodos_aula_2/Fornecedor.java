package Metodos_aula_2;

public class Fornecedor extends Pessoa{
    //atributos
    private float valorCredito;
    private float valorDivida;

    //Getter's
    public float getValorCredito() {
        return valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    //Setter's
    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void obterSaldo(float saldo){
        saldo = this.valorCredito - valorDivida;
        System.out.println("Saldo: " +saldo );
    }
}
