package Fila;

public class Fila {




        private Nodo inicio;
        private Nodo fim;

        public Fila() {
            this.inicio = null;
            this.fim = null;
        }

        public boolean isEmpty() {
            return inicio == null;
        }

        public void insereFinal(int valor) {
            Nodo novo = new Nodo(valor, null);
            if (isEmpty()) {
                inicio = novo;
                fim = novo;
            } else {
                fim.setProx(novo);
                fim = novo;
            }
        }

        public void removerFila() {
            if (isEmpty()) {
                System.out.println("Fila Vazia");
            } else {
                inicio = inicio.getProx();
                if (inicio == null) {
                    fim = null; // Se a fila fica vazia, o fim também deve ser nulo
                }
            }
        }

        public void imprimeFila() {
            if (isEmpty()) {
                System.out.println("Fila Vazia");
            } else {
                Nodo aux = inicio;
                System.out.println("Os valores da fila são:");
                while (aux != null) {
                    System.out.println(aux.getValor());
                    aux = aux.getProx();
                }
            }
        }

        public Nodo getInicio() {
            return inicio;
        }
    }


