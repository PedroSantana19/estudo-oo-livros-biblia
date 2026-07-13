import modelos.Carta;
import modelos.EscritoBiblico;
import modelos.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Livro Genesis = new Livro("Genesis", "Antigo testamento", 50, "Histórico");
    Genesis.exibirDados();

    Carta Apocalipse = new Carta("Apocalipse", "Novo testamento", 22, "Igrejas da Ásia");
    Apocalipse.exibirDados();



    }
}