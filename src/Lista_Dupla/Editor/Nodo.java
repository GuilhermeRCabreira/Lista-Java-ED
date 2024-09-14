package Lista_Dupla.Editor;

public class Nodo {
    String texto;
    Nodo anterior;
    Nodo proximo;

    public Nodo(String texto) {
        this.texto = texto;
        this.anterior = null;
        this.proximo = null;
    }
}
