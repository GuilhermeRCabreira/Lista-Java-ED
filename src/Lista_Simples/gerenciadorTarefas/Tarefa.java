package Lista_Simples.gerenciadorTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private Tarefa prox;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
        this.prox = null;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Tarefa getProx() {
        return prox;
    }

    public void setProx(Tarefa prox) {
        this.prox = prox;
    }
}
