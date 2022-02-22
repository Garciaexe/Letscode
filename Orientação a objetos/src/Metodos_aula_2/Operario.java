package Metodos_aula_2;

public class Operario extends Empregado {
    //Atributos
    private float valorProducao;
    private float comissao;

    //Getter's
    public float getValorProducao() { return valorProducao; }
    public float getComissao() { return comissao; }

    //Setter's
    public void setValorProducao(float valorProducao) { this.valorProducao = valorProducao; }
    public void setComissao(float comissao) { this.comissao = comissao; }

    //metodo para calcular salario
    @Override
    public void calcularSalario() {
        setSalario((getSalarioBase() - ((getSalarioBase()/100) * getImpostoRetido())) + ((valorProducao / 100) * this.comissao));
        System.out.println("O salario do empregado " + this.getNome() + " é: " + getSalario());
    }
}
