package Lista_Simples.gerenciadorTarefas;

public class GerenciadorTarefas {
    private Tarefa inicio;

    public GerenciadorTarefas() {
        this.inicio = null;
    }

    public void adicionarTarefa(String descricao) {
        Tarefa nova = new Tarefa(descricao);
        if (inicio == null) {
            inicio = nova;
        } else {
            Tarefa aux = inicio;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(nova);
        }
    }

    public void removerTarefa(String descricao) {
        if (inicio == null) return;

        if (inicio.getDescricao().equals(descricao)) {
            inicio = inicio.getProx();
            return;
        }

        Tarefa anterior = null;
        Tarefa atual = inicio;

        while (atual != null && !atual.getDescricao().equals(descricao)) {
            anterior = atual;
            atual = atual.getProx();
        }

        if (atual != null) {
            anterior.setProx(atual.getProx());
        }
    }

    public void marcarConcluida(String descricao) {
        Tarefa aux = inicio;
        while (aux != null) {
            if (aux.getDescricao().equals(descricao)) {
                aux.setConcluida(true);
                return;
            }
            aux = aux.getProx();
        }
    }

    public void exibirTarefas() {
        Tarefa aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDescricao() + (aux.isConcluida() ? " [Concluída]" : ""));
            aux = aux.getProx();
        }
    }
}
