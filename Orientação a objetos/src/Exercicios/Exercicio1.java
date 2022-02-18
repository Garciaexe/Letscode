package Exercicios;

import Metodos.Funcionario;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String sobreNome;
        String cidade;
        String estado;
        float horasTrabalhadas;
        float valorHora;
        int escolha = 0;
        float valor;

        System.out.println("Digite o nome:");
        nome = scan.nextLine();
        System.out.println("Digite o sobrenome");
        sobreNome = scan.nextLine();
        System.out.println("Digite a cidade:");
        cidade = scan.nextLine();
        System.out.println("Digite o estado:");
        estado = scan.nextLine();
        System.out.println("Digite as horas trabalhadas");
        horasTrabalhadas = scan.nextFloat();
        System.out.println("Digite o valor da hora trabalhada:");
        valorHora = scan.nextFloat();

        Funcionario funcionario1 = new Funcionario(nome, sobreNome, cidade, estado, horasTrabalhadas, valorHora);

        funcionario1.retornaNome();
        while(escolha != 4) {
            System.out.println("Digite 1 para incrementar a quantidades de horas digitas \nDigite 2 para substituir o valor da hora do funcionario \nDigite 3 para calcular o valor do salario funcionario\nDigite 4 para sair");
            escolha = scan.nextInt();
            if (escolha == 1) {
                System.out.println("Digite o número de horas para incrementar:");
                valor = scan.nextFloat();
                funcionario1.adicionarHoras(valor);
                System.out.println("Horas acumuladas: " + funcionario1.getHorasTrabalhadas());
            }
            if (escolha == 2) {
                System.out.println("Digite o novo valor das horas");
                valor = scan.nextInt();
                funcionario1.valorPorHora(valor);
            }
            if (escolha == 3) {
                funcionario1.calculoSalario();
            }
        }
    }
}
