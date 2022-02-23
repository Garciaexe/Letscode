package Aula_2_e_3.Metodos;

public class Fornecedor extends Pessoa{
    //atributos
    private float valorCredito;
    private float valorDivida;
    private float saldo;

    //Construtor Default
    public Fornecedor(){}

    //Construtor
    public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //Polimofismo de sobreposição, pois estou sobrepondo o toString da classe pessoa.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", valorCredito ='" + valorCredito + '\'' +
                ", valorDivida =' " + valorDivida + '\'' +
                '}';
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
