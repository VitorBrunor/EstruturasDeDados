package ListaGenerica;

public class programaInt {
    public static void main(String[] args) {
        listaLigada<Integer> numeros = new listaLigada<Integer>();
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);

        System.out.println("Tamanho: " + numeros.getTamanho());
        for(int i = 0; i < numeros.getTamanho(); i++) {
            System.out.println(numeros.get(i).getValor());
        }
    }
}
