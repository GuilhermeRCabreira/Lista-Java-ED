package Fila;

public class Nodo {
    private int valor;
    private Nodo prox;

    public Nodo() {
        this.valor = 0;
        this.prox = null;
    }

    public Nodo(int val, Nodo p) {
        this.valor = val;
        this.prox = p;
    }

    public Nodo getProx() {
        return prox;
    }

    public int getValor() {
        return valor;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
