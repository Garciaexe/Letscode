package Aula_2_e_3.Exercicios;
import Aula_2_e_3.Metodos.Fornecedor;

public class ExercicioFornecedor {
    public static void main(String[] args) {

        //Estanciando fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Pedro", "Rua y", "33221122", 10000, 2000);

        //metodo
        fornecedor1.obterSaldo();
    }
}
