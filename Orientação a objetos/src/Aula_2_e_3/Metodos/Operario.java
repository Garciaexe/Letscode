package Aula_2_e_3.Metodos;

public class Operario extends Empregado {
    //Atributos
    private float valorProducao;
    private float comissao;

    //Getters
    public float getValorProducao() { return valorProducao; }
    public float getComissao() { return comissao; }

    //Setters
    public void setValorProducao(float valorProducao) { this.valorProducao = valorProducao; }
    public void setComissao(float comissao) { this.comissao = comissao; }

    //metodo para calcular salario
    @Override
    public void calcularSalario() {
        setSalario((getSalarioBase() - ((getSalarioBase()/100) * getImpostoRetido())) + ((this.valorProducao / 100) * this.comissao));
        System.out.println("O salario do empregado " + getNome() + " é: " + getSalario());
    }
}
