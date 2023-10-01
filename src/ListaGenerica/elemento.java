package ListaGenerica;

public class elemento<TIPO> {
    private TIPO valor;
    private elemento<TIPO> proximo;

    public elemento(TIPO novoValor) {
        this.valor = novoValor;
    }
    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public elemento getProximo() {
        return proximo;
    }

    public void setProximo(elemento<TIPO> proximo) {
        this.proximo = proximo;
    }
}
