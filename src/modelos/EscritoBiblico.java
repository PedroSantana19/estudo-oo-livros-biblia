package modelos;

// Atributos a serem herdados
public class EscritoBiblico {
    protected String nome;
    protected String testamento;
    protected int capitulos;

    // Construtor da classe mãe
    public EscritoBiblico(String nome, String testamento, int capitulos) {
        this.nome = nome;
        this.testamento =  testamento;
        this.capitulos = capitulos;
    }

    // Método comum herdado pelas filhas

    public void exibirDados() {
        System.out.println("Livro: " + nome + "Testamento: " + testamento + "Capítulos: " + capitulos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTestamento() {
        return testamento;
    }

    public void setTestamento(String testamento) {
        this.testamento = testamento;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;

    }
}


