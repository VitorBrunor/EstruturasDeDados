package Vetor;

import java.util.Scanner;
public class vetor {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CF";
        estados[3] = "ES";
        estados[4] = "MS";
        estados[5] = "SP";
        estados[6] = "RJ";
        estados[7] = "PB";
        estados[8] = "AM";
        estados[9] = "RN";

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado você quer buscar? ");
        String siglaBusca = leitor.nextLine();

        //Aplicando busca linear -> não é rápida, seu custo computacional é linear
        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if (elemento.equalsIgnoreCase(siglaBusca)) {
                encontrou = true;
                break;
            }
        }

        if (encontrou == true) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }
    }
}