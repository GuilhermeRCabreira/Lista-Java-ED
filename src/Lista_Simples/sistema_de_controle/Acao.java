package Lista_Simples.sistema_de_controle;

public class Acao {
    private String descricao;
    private Acao prox;

    public Acao(String descricao) {
        this.descricao = descricao;
        this.prox = null;
    }

    public String getDescricao() {
        return descricao;
    }

    public Acao getProx() {
        return prox;
    }

    public void setProx(Acao prox) {
        this.prox = prox;
    }
}
