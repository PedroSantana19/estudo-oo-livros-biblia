package modelos;


public class Livro extends EscritoBiblico {

    private String genero;

    //Construtor

    public Livro(String nome, String testamento, int capitulos, String genero) {
        super(nome, testamento, capitulos);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;

    }

    @Override
    public void exibirDados () {
        super.exibirDados();
        System.out.println("Tipo: Livro | genero: " + genero);
    }

}
