package Aula_2_e_3.Metodos;

public class Pessoa {
    //Atributos
    private String nome;
    private String endereco;
    private String telefone;

    //Construtor default
    public Pessoa(){};

    //Construtor
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Polimofismo de sobreposição, sobrepondo o metodo default.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    //Getters
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }

    //Setter'spublic void setNome(String nome) { this.nome = nome; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
