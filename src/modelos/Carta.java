package modelos;

public class Carta extends EscritoBiblico {
    private String destinatario;

    //Construtor

    public Carta(String nome, String testamento, int capitulos, String destinatario) {
        super(nome, testamento, capitulos);
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Carta | dest: " + destinatario);
    }

}

