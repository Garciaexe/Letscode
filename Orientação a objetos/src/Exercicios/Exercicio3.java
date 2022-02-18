package Exercicios;

import Metodos.Veiculo;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //atributos
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setModelo("Lancer");
        veiculo1.setMarca("mitsubishi");
        veiculo1.setAno("2014");
        veiculo1.setCor("Branco");
        veiculo1.setFipe(60202);
        veiculo1.setVelocidadeMaxima(110);

        //metodos
        veiculo1.velocidade(500);
        veiculo1.freagem();
    }
}
