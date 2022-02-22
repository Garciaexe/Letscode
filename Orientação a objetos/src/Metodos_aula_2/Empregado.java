package Metodos_aula_2;

public class Empregado extends Pessoa{
    //Atributos, vou usar o construtor default.
    private int codigoSetor;
    private float salarioBase;
    private float impostoRetido;
    private float salario;

    //Getters
    public int getCodigoSetor() { return codigoSetor; }
    public float getSalarioBase() { return salarioBase; }
    public float getImpostoRetido() { return impostoRetido; }
    public float getSalario() {  return salario; }

    //Setters
    public void setCodigoSetor(int codigoSetor) { this.codigoSetor = codigoSetor; }
    public void setSalarioBase(float salarioBase) { this.salarioBase = salarioBase; }
    public void setImpostoRetido(float impostoRetido) { this.impostoRetido = impostoRetido; }
    public void setSalario(float salario) { this.salario = salario; }

    //Metodo para calcular salario
    public void calcularSalario(){
        this.salario = this.salarioBase - ((this.salarioBase / 100) * this.impostoRetido);
        System.out.println("O salario do empregado " + getNome() + " é: " + this.salario);
    }
}
