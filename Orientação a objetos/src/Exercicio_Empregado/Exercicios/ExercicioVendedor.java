package Exercicio_Empregado.Exercicios;
import Exercicio_Empregado.Metodos.Vendedor;

import java.util.Scanner;

public class ExercicioVendedor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vendedor vendedor1 = new Vendedor();

        //Coletando atributos
        System.out.println("Digite o nome do Vendedor:");
        vendedor1.setNome(scan.nextLine());
        System.out.println("Digite o endereço do  operario:");
        vendedor1.setEndereco(scan.nextLine());
        System.out.println("Digite o telefone do  operario:");
        vendedor1.setTelefone(scan.nextLine());
        System.out.println("Digite o código do setor");
        vendedor1.setCodigoSetor(scan.nextInt());
        System.out.println("Digite o salario base do operario:");
        vendedor1.setSalarioBase(scan.nextFloat());
        System.out.println("Digite a % de imposto sobre o salário:");
        vendedor1.setImpostoRetido(scan.nextFloat());
        System.out.println("Digite o valor de vendas do vendedor:");
        vendedor1.setValorVendas(scan.nextFloat());
        System.out.println("Digite a % de comissão:");
        vendedor1.setComissao(scan.nextFloat());

        //Aplicando metodo de calculo do salario
        vendedor1.calcularSalario();
    }
}
