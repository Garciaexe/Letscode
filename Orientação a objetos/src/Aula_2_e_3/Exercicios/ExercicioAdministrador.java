package Aula_2_e_3.Exercicios;
import Aula_2_e_3.Metodos.Administrador;
import java.util.Scanner;

public class ExercicioAdministrador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Administrador admin1 = new Administrador();

        //Coletando atributos
        System.out.println("Digite o nome do administrador:");
        admin1.setNome(scan.nextLine());
        System.out.println("Digite o endereço do  administrador:");
        admin1.setEndereco(scan.nextLine());
        System.out.println("Digite o telefone do  administrador:");
        admin1.setTelefone(scan.nextLine());
        System.out.println("Digite o código do setor");
        admin1.setCodigoSetor(scan.nextInt());
        System.out.println("Digite o salario base do administrador:");
        admin1.setSalarioBase(scan.nextFloat());
        System.out.println("Digite a % de imposto sobre o salário:");
        admin1.setImpostoRetido(scan.nextFloat());
        System.out.println("Digite o valor da ajuda de custo");
        admin1.setAjudaCusto(scan.nextFloat());

        //Aplicando metodo de calculo do salario
        admin1.calcularSalario();
    }
}
