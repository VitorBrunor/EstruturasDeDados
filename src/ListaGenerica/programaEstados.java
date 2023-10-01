package ListaGenerica;

public class programaEstados {
    public static void main(String[] args) {
        listaLigada<String> lista = new listaLigada<String>();

        lista.adicionar("AC");
        lista.adicionar("ES");
        lista.adicionar("SP");
        lista.adicionar("CE");


        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        for(int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        //Remover estado ES
        lista.remover("CE");
        System.out.println("Removeu estado CE");
        lista.adicionar("PR");
        System.out.println("Adicionou estade PR");
        lista.remover("AC");
        lista.remover("ES");
        lista.remover("SP");
        lista.remover("PR");
        lista.adicionar("RJ");

        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}