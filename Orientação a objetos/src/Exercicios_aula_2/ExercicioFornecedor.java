package Exercicios_aula_2;
import Metodos_aula_2.Fornecedor;
import java.util.Scanner;

public class ExercicioFornecedor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String endereco;
        String telefone;
        float valorCredito;
        float valorDivida;
        int escolha = 0;

        //Lendo informações
        System.out.println("Digite o nome do fornecedor:");
        nome = scan.nextLine();
        System.out.println("Digite o endereço do fornecedor:");
        endereco = scan.nextLine();
        System.out.println("Digite o telefone do fornecedor:");
        telefone = scan.nextLine();
        System.out.println("Digite o credito do fornecedor:");
        valorCredito = scan.nextFloat();
        System.out.println("Digite a divida do fornecedor:");
        valorDivida = scan.nextFloat();

        //Setando atributos
        Fornecedor fornecedor1= new Fornecedor(valorCredito, valorDivida);
        fornecedor1.setNome(nome);
        fornecedor1.setEndereco(endereco);
        fornecedor1.setTelefone(telefone);

        //metodo
        fornecedor1.obterSaldo();
    }
}
