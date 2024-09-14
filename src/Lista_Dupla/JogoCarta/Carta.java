package Lista_Dupla.JogoCarta;

public class Carta {
    String nome;
    Carta anterior, proximo;

    public Carta(String nome) {
        this.nome = nome;
        this.anterior = null;
        this.proximo = null;
    }
}
