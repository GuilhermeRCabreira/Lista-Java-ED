package Lista_Simples.historico;

public class HistoricoNavegacao {
    private URL inicio;
    private int tamanhoMax;
    private int tamanhoAtual;

    public HistoricoNavegacao(int tamanhoMax) {
        this.inicio = null;
        this.tamanhoMax = tamanhoMax;
        this.tamanhoAtual = 0;
    }

    public void adicionarURL(String endereco) {
        URL nova = new URL(endereco);
        if (inicio == null) {
            inicio = nova;
        } else {
            URL aux = inicio;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(nova);
        }
        tamanhoAtual++;

        if (tamanhoAtual > tamanhoMax) {
            removerPrimeiraURL();
        }
    }

    public void removerPrimeiraURL() {
        if (inicio != null) {
            inicio = inicio.getProx();
            tamanhoAtual--;
        }
    }

    public void exibirHistorico() {
        URL aux = inicio;
        while (aux != null) {
            System.out.println(aux.getEndereco());
            aux = aux.getProx();
        }
    }
}
