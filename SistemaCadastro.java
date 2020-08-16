package com;

import java.util.Scanner;

public class SistemaCadrastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String sobrenome;
        String senha = null;

        System.out.println("Escreva seu primeiro nome: ");
        nome = scanner.nextLine(); //Entrada para usuario

        System.out.println("Escreva seu último nome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Nome: "+ nome +" "+ sobrenome);
        String username = nome.charAt(0)+"_"+sobrenome;
        
        boolean senhainvalida = false;

        while (senhainvalida == false) {
            System.out.println("Defina uma senha: ");
            System.out.println("       (Obs:sua senha deve conter no mínimo 8 caracteres contendo pelo menos 1 letra maiúscula, 1 letra minúscula, 1 números e 1 caractere especial)");
            senha = scanner.nextLine();

            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
                senhainvalida = true;
                System.out.println("Cadastro realizado com sucesso!");
            }
            else {
                System.out.println("A senha não corresponde os requisitos!");
            }
        }
        System.out.println("Username: " + username);
        System.out.println("Senha: " + senha);

        boolean validlogin = false;
        while (validlogin == false) {
            System.out.println("Username: ");
            String login = scanner.nextLine();
            System.out.println("Senha: ");
            String loginpass = scanner.nextLine();

            if (login.equals(username) && loginpass.equals(senha) )  {
                System.out.println("Login realizado com sucesso!");
                validlogin = true;
            }
            else {
                System.out.println("login incorreto, tente novamente.");
            }
        }


    }
}