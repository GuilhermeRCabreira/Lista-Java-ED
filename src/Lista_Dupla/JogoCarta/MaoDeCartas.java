package Lista_Dupla.JogoCarta;

public class MaoDeCartas {
    private Carta inicio, fim;

    public MaoDeCartas() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarCarta(String nome) {
        Carta novaCarta = new Carta(nome);
        if (inicio == null) {
            inicio = fim = novaCarta;
        } else {
            fim.proximo = novaCarta;
            novaCarta.anterior = fim;
            fim = novaCarta;
        }
        System.out.println("Carta adicionada: " + nome);
    }

    public void removerCarta(String nome) {
        Carta temp = inicio;
        while (temp != null) {
            if (temp.nome.equals(nome)) {
                if (temp == inicio) {
                    inicio = inicio.proximo;
                    if (inicio != null) {
                        inicio.anterior = null;
                    }
                } else if (temp == fim) {
                    fim = fim.anterior;
                    if (fim != null) {
                        fim.proximo = null;
                    }
                } else {
                    temp.anterior.proximo = temp.proximo;
                    if (temp.proximo != null) {
                        temp.proximo.anterior = temp.anterior;
                    }
                }
                System.out.println("Carta removida: " + nome);
                return;
            }
            temp = temp.proximo;
        }
        System.out.println("Carta não encontrada.");
    }

    public void reorganizarCarta(String nome) {
        Carta temp = inicio;
        while (temp != null) {
            if (temp.nome.equals(nome)) {
                removerCarta(nome);
                adicionarCarta(nome);
                System.out.println("Carta reorganizada: " + nome);
                return;
            }
            temp = temp.proximo;
        }
        System.out.println("Carta não encontrada para reorganização.");
    }

    public void exibirMao() {
        Carta temp = inicio;
        System.out.println("Cartas na mão:");
        while (temp != null) {
            System.out.println(temp.nome);
            temp = temp.proximo;
        }
    }
}
