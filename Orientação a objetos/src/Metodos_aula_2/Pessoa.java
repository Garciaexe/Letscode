package Metodos_aula_2;

public class Pessoa {
    //Atributos
    private String nome;
    private String endereco;
    private String telefone;

    //Construtor default
    public Pessoa(){};

    //Construtor1
    public Pessoa(String nome){
        this.nome = nome;
    }

    //Construtor2
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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
