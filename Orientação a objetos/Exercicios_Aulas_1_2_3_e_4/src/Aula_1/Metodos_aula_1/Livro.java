package Aula_1.Metodos_aula_1;

public class Livro {
    private String titulo;
    private String nomeLeitor;
    private float paginasTotal;
    private float paginasLidas;
    float porcetagem;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public void setPaginasTotal(float paginasTotal) {
        this.paginasTotal = paginasTotal;
    }

    public void setPaginasLidas(float paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void resultado(){
        this.porcetagem = (this.paginasLidas / this.paginasTotal) * 100;
        System.out.printf("Porcetagem de paginas lidas: %.2f", this.porcetagem);
    }
}
