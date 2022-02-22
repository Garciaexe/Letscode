package Aula_1.Metodos_aula_1;

public class Veiculo {
    private String modelo;
    private String marca;
    private String ano;
    private int velocidadeMaxima;
    private String cor;
    private float fipe;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFipe(float fipe) {
        this.fipe = fipe;
    }

    void imprimirAtributos(){
        System.out.println("Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano);
    }

    public void velocidade (int velocidade){
        if(velocidade > this.velocidadeMaxima){
            System.out.println("Velocidade acima do valor permitido para o veículo");
        }else{
            System.out.println("Estou acelerando " + velocidade + "km/h");
        }
    }
    public void freagem (){
        System.out.println("Estou freando o veículo: " + this.modelo);
    }
}
