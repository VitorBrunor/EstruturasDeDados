package ListaGenerica;

public class cliente {
    private String CPF;
    private String nome;

    public cliente(String novoCPF, String novoNome){
        this.CPF = novoCPF;
        this.nome = novoNome;
    }
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }
}
