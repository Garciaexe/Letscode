package Exercicios_aula_2;
import Metodos_aula_2.Empregado;
import java.util.Scanner;

public class ExercicioEmpregado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Empregado empregado1 = new Empregado();

        //Coletando atributos
        System.out.println("Digite o nome do empregado:");
        empregado1.setNome(scan.nextLine());
        System.out.println("Digite o endereço do empregado:");
        empregado1.setEndereco(scan.nextLine());
        System.out.println("Digite o telefone do empregado:");
        empregado1.setTelefone(scan.nextLine());
        System.out.println("Digite o código do setor");
        empregado1.setCodigoSetor(scan.nextInt());
        System.out.println("Digite o salario base do empregado:");
        empregado1.setSalarioBase(scan.nextFloat());
        System.out.println("Digite a % de imposto sobre o salário:");
        empregado1.setImpostoRetido(scan.nextFloat());

        //Aplicando metodo de calculo do salario
        empregado1.calcularSalario();
    }
}
