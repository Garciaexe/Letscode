package Aula_2.Metodos_aula_2;

public class Fornecedor extends Pessoa{
    //atributos
    private float valorCredito;
    private float valorDivida;
    private float saldo;

    //Construtor
    public Fornecedor(float valorCredito, float valorDivida){
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //Getters
    public float getValorCredito() {
        return valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    //Setters
    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    //Metodo para obter saldo
    public void obterSaldo(){
        this.saldo = this.valorCredito - this.valorDivida;
        System.out.println("O saldo do fornecedor " + getNome() + " é: " +this.saldo );
    }
}
