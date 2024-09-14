package Lista_Simples.sistema_de_controle;

public class ControleReversao {
    private Acao topo;

    public ControleReversao() {
        this.topo = null;
    }

    public void realizarAcao(String descricao) {
        Acao nova = new Acao(descricao);
        if (topo == null) {
            topo = nova;
        } else {
            nova.setProx(topo);
            topo = nova;
        }
    }

    public void desfazerAcao() {
        if (topo != null) {
            System.out.println("Desfazendo: " + topo.getDescricao());
            topo = topo.getProx();
        } else {
            System.out.println("Nenhuma ação para desfazer.");
        }
    }

    public void exibirAcoes() {
        Acao aux = topo;
        while (aux != null) {
            System.out.println(aux.getDescricao());
            aux = aux.getProx();
        }
    }
}
