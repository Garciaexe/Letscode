package Exercicios_aula_2;
import Metodos_aula_2.Operario;
import java.util.Scanner;

public class ExercicioOperario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operario operario1 = new Operario();

        //Coletando atributos
        System.out.println("Digite o nome do operario:");
        operario1.setNome(scan.nextLine());
        System.out.println("Digite o endereço do  operario:");
        operario1.setEndereco(scan.nextLine());
        System.out.println("Digite o telefone do  operario:");
        operario1.setTelefone(scan.nextLine());
        System.out.println("Digite o código do setor");
        operario1.setCodigoSetor(scan.nextInt());
        System.out.println("Digite o salario base do operario:");
        operario1.setSalarioBase(scan.nextFloat());
        System.out.println("Digite a % de imposto sobre o salário:");
        operario1.setImpostoRetido(scan.nextFloat());
        System.out.println("Digite o valor de produção do operario:");
        operario1.setValorProducao(scan.nextFloat());
        System.out.println("Digite a % de comissão:");
        operario1.setComissao(scan.nextFloat());

        //Aplicando metodo de calculo do salario
        operario1.calcularSalario();
    }
}
