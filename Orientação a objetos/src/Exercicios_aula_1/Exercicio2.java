package Exercicios_aula_1;

import Metodos_aula_1.Livro;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Livro livro1 = new Livro();

        System.out.println("Digite o nome do leitor:");
        livro1.setNomeLeitor(scan.nextLine());
        System.out.println("Digite o nome do livro");
        livro1.setTitulo(scan.next());
        System.out.println("Digite o número de páginas do livro:");
        livro1.setPaginasTotal(scan.nextFloat());
        System.out.println("Digite o número de láginas lidas:");
        livro1.setPaginasLidas(scan.nextFloat());

        livro1.resultado();
    }
}
