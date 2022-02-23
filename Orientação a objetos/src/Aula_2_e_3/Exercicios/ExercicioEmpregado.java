package Aula_2_e_3.Exercicios;
import Aula_2_e_3.Metodos.Empregado;

public class ExercicioEmpregado {
    public static void main(String[] args) {

        //Estanciando empregado
        Empregado empregado1 = new Empregado("Joao", "Rua x", "33221133", 3, 2000, 5);

        //Aplicando toString
        System.out.println(empregado1);

        //Aplicando metodo de calculo do salario
        empregado1.calcularSalario();

    }
}
