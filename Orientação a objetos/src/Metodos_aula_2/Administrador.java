package Metodos_aula_2;

public class Administrador extends Empregado {
    //Atributos
    private float ajudaCusto;

    //getter
    public float getAjudaCusto() {
        return ajudaCusto;
    }

    //setter
    public void setAjudaCusto(float ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    //metodo para calcular salario
    @Override
    public void calcularSalario() {
        setSalario((getSalarioBase() - ((getSalarioBase()/100) * getImpostoRetido())) + this.ajudaCusto);
        System.out.println("O salario do empregado " + getNome() + " é: " + getSalario());
    }
}
