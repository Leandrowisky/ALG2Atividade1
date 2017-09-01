package atividade01;

import java.util.Scanner;

public class Atividade01 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static boolean ExisteNome(String[] v, String nome) {
        for (String string : v) {
            if (string.equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static void Menu() {
        System.out.println(" ****** Menu de Opções ****** ");
        System.out.println("1 - Adicionar um novo nome\n"
                + "2 - Apresentar os nomes\n"
                + "3 - Pesquisar um nome\n"
                + "4 - Remover um nome\n"
                + "0 - Sair");

        switch (console.nextInt()) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção não disponivel, selecione novamente.");
        }
    }

    public static void AdicionarNome(String[] v) {
        String nome = "";
        System.out.print("Escreva o Nome a ser Adicionado: ");
        nome = console.nextLine();
        
        if (ExisteNome(v, nome))
            System.out.println("O Nome Digitado já Existe na Lista, o Mesmo Não Será Adicionado.");
        
        
    }
}
