package Lista_Simples.historico;

public class URL {
    private String endereco;
    private URL prox;

    public URL(String endereco) {
        this.endereco = endereco;
        this.prox = null;
    }

    public String getEndereco() {
        return endereco;
    }

    public URL getProx() {
        return prox;
    }

    public void setProx(URL prox) {
        this.prox = prox;
    }
}
