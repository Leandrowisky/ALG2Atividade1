package atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Menu();
    }

    public static boolean ExisteNome(String[] v, String nome) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                if (v[i].equals(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Menu() {
        Scanner console = new Scanner(System.in);
        String[] v = new String[5];

        while (true) {
            System.out.println(" ****** Menu de Opções ****** ");
            System.out.println("1 - Adicionar um novo nome\n"
                    + "2 - Apresentar os nomes\n"
                    + "3 - Pesquisar um nome\n"
                    + "4 - Remover um nome\n"
                    + "0 - Sair");

            switch (console.nextInt()) {
                case 1:
                    AdicionarNome(v);
                    break;
                case 2:
                    listarNomes(v);
                    break;
                case 3:
                    pesquisaNome(v);
                    break;
                case 4:
                    removerNome(v);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção não disponivel, selecione novamente.");
            }
        }
    }

    //static Scanner console = new Scanner(System.in);
    public static void AdicionarNome(String[] v) {
        Scanner console = new Scanner(System.in);
        String nome = "";
        Boolean adc = false;

        System.out.print("Escreva o Nome a ser Adicionado: ");
        nome = console.nextLine();

        if (ExisteNome(v, nome)) {
            System.out.println("O Nome Digitado já Existe na Lista, o Mesmo Não Será Adicionado.");
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] == null) {
                v[i] = nome;
                adc = true;
                break;
            }
        }

        if (!adc) {
            System.out.println("A Lista está cheia, nome não adicionado!");
        }

    }

    public static void listarNomes(String[] v) {
        for (int i = 0; i < v.length; i++) {
            if (i == 0 && v[i] == null) {
                System.out.println("A Lista está vazia e não poderá ser impressa.");
            } else if (v[i] != null) {
                System.out.println(v[i]);
            }
        }
    }

    public static void pesquisaNome(String[] v) {
        Scanner console = new Scanner(System.in);
        boolean encontrado = false;

        System.out.print("Digite o nome que deseja pesquisar: ");
        String nome = console.nextLine();

        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                if (v[i].equals(nome)) {
                    encontrado = true;
                    System.out.println("O Nome pesquisado foi encontrado na posição " + i + " do vetor.");
                }
            }
        }
        if (!encontrado) {
            System.out.println("O Nome pesquisado não foi encontrado.");
        }
    }

    public static void removerNome(String[] v) {
        Scanner console = new Scanner(System.in);
        boolean encontrado = false;
        int posV = 0;

        System.out.print("Digite o nome que deseja remover: ");
        String nome = console.nextLine();

        for (String string : v) {
            if (string.equals(nome)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("O Nome pesquisado para exclusão não foi encontrado.");
        } else {
            for (int i = 0; i < v.length; i++) {
                if (v[i].equals(nome)) {
                    posV++;
                }
                v[i] = v[posV];
                posV++;
            }
        }

    }
}
