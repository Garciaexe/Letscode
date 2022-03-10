package Aula_2_e_3.Exercicios;
import Aula_2_e_3.Metodos.Empregado;
import Enums.TipoJornadaEmpregado;

public class ExercicioEmpregado {
    public static void main(String[] args) {

        //Estanciando empregado
        Empregado empregado1 = new Empregado("Joao", "Rua x", "33221133", 5000, 6, 1, TipoJornadaEmpregado.PERIODO_COMPLETO);

        //Aplicando toString
        System.out.println(empregado1);

        //Aplicando metodo de calculo do salario
        empregado1.calcularSalario();

    }
}
