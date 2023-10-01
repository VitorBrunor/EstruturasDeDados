package ListaGenerica;

public class programaClientes {
    public static void main(String[] args) {
        listaLigada<cliente> clientes = new listaLigada<cliente>();
        clientes.adicionar(new cliente("132","João"));
        clientes.adicionar(new cliente("178","Maria"));
        clientes.adicionar(new cliente("186","Billy"));
        clientes.adicionar(new cliente("185","Wanda"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for(int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
    }
}
