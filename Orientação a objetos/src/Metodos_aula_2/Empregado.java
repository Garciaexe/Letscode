package Metodos_aula_2;

public class Empregado extends Pessoa{
    //Atributos, vou usar o construtor default.
    private int codigoSetor;
    private float salarioBase;
    private float impostoRetido;
    private float valorPorcentagem;
    private float salario;

    //Getter's
    public int getCodigoSetor() {
        return codigoSetor;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    public float getImpostoRetido() {
        return impostoRetido;
    }
    public float getValorPorcentagem() { return valorPorcentagem; }
    public float getSalario() {  return salario; }

    //Setter's
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setImpostoRetido(float impostoRetido) {
        this.impostoRetido = impostoRetido;
    }
    public void setValorPorcentagem(float valorPorcentagem) { this.valorPorcentagem = valorPorcentagem; }
    public void setSalario(float salario) { this.salario = salario; }

    //Metodo para calcular salario
    public void calcularSalario(){
        this.valorPorcentagem = (this.salarioBase / 100) * this.impostoRetido;
        this.salario = this.salarioBase - this.valorPorcentagem;
        System.out.println("O salario do empregado " + this.getNome() + " é: " + this.salario);
    }
}
