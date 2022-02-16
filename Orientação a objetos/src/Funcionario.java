public class Funcionario {
    String nome;
    String sobreNome;
    String cidade;
    String estado;
    float horasTrabalhadas;
    float valorHora;
    float salario;

    Funcionario(){}

    Funcionario(String nome, String sobreNome, String cidade, String estado, float horasTrabalhadas, float valorHora){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    void retornaNome(){
        System.out.println(this.nome + " " + this.sobreNome);
    }

    void adicionarHoras(float horas){
        this.horasTrabalhadas += horas;
        System.out.println("Horas adicionadas");
    }

    void valorPorHora(float valor){
        this.valorHora = valor;
        System.out.println("O valor por hora é: " + valorHora);
    }
    void calculoSalario(){
        this.salario = this.valorHora * this.horasTrabalhadas;
        System.out.println("Salario: " + salario);
    }
}
