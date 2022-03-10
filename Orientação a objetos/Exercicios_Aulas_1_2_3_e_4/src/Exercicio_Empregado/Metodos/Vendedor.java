package Exercicio_Empregado.Metodos;

public class Vendedor extends Empregado{
    //Atributos
    private float valorVendas;
    private float comissao;

    //Getters

    public float getValorVendas() { return valorVendas; }
    public float getComissao() { return comissao; }

    //Setters

    public void setValorVendas(float valorVendas) { this.valorVendas = valorVendas; }
    public void setComissao(float comissao) { this.comissao = comissao; }

    //Metodo para calcular salario
    @Override
    public void calcularSalario() {
        setSalario((getSalarioBase() - ((getSalarioBase()/100) * getImpostoRetido())) + ((this.valorVendas / 100) * this.comissao));
        System.out.println("O salario do empregado " + getNome() + " é: " + getSalario());
    }
}
