package Metodos;

public class Funcionario {
    private String nome;
    private String sobreNome;
    private String cidade;
    private String estado;
    private float horasTrabalhadas;
    private float valorHora;
    private float salario;

    Funcionario(){}

   public Funcionario(String nome, String sobreNome, String cidade, String estado, float horasTrabalhadas, float valorHora){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void retornaNome(){
        System.out.println(this.nome + " " + this.sobreNome);
    }

    public void adicionarHoras(float horas){
        this.horasTrabalhadas += horas;
        System.out.println("Horas adicionadas");
    }

    public void valorPorHora(float valor){
        this.valorHora = valor;
        System.out.println("O valor por hora é: " + valorHora);
    }
    public void calculoSalario(){
        this.salario = this.valorHora * this.horasTrabalhadas;
        System.out.println("Salario: " + salario);
    }
}
