package Lista_Dupla.Editor;

public class EditorTexto {
    private Nodo atual;
    private Nodo undo;
    private Nodo redo;

    public EditorTexto() {
        this.atual = new Nodo("");  // Começa com um nó inicial vazio
        this.undo = null;
        this.redo = null;
    }

    public void adicionarTexto(String texto) {
        Nodo novoNodo = new Nodo(texto);
        atual.proximo = novoNodo;
        novoNodo.anterior = atual;
        atual = novoNodo;

        // Limpar redo
        redo = null;
    }

    public void desfazer() {
        if (atual.anterior != null) {
            // Mover o nó atual para a lista de redo
            Nodo nodoUndo = atual;
            atual = atual.anterior;

            nodoUndo.anterior = undo;
            undo = nodoUndo;

            // Limpar redo se houver
            redo = null;
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void refazer() {
        if (undo != null) {
            Nodo nodoRedo = undo;
            undo = undo.anterior;

            nodoRedo.proximo = atual.proximo;
            if (atual.proximo != null) {
                atual.proximo.anterior = nodoRedo;
            }
            atual.proximo = nodoRedo;
            nodoRedo.anterior = atual;
            atual = nodoRedo;

            // Limpar redo
            redo = null;
        } else {
            System.out.println("Nada para refazer.");
        }
    }

    public void exibirTexto() {
        Nodo temp = atual;
        while (temp.anterior != null) {
            temp = temp.anterior;
        }
        while (temp != null) {
            System.out.println(temp.texto);
            temp = temp.proximo;
        }
    }
}
