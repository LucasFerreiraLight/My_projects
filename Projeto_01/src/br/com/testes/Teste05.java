package br.com.testes;

import java.util.Scanner;
public class Teste05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();
        System.out.println("******( Calculadora )******");
        System.out.println("    Digite     ");
        System.out.println("Soma        (1)");
        System.out.println("Subtrair    (2)");
        System.out.println("Multiplicar (3)");
        System.out.println("Dividir     (4)");
        System.out.println("Sair        (5)");
        int menu = 0;


        while (menu != 5) {
            System.out.println("Escolha: ");
            if (read.hasNextInt()) {
                menu = read.nextInt();
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número válido.");
                read.nextLine();
            }
            //}
            // Digitado 1 ( Somar )
            if (menu== 1) {
                System.out.println("            (SOMA!)                ");
                System.out.println("Digite (2) números a ser Somados! ");
                System.out.println("********************************");
                double num1, num2;
                while (true) {
                    System.out.println("Digite o Primeiro número: ");
                    if (read.hasNextDouble()) {
                        num1 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next();
                    }
                }
                read.nextLine();
                while (true) {
                    System.out.println("Digite o Segundo número: ");
                    if (read.hasNextDouble()) {
                        num2 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next();
                    }
                }
                double resultadoSoma = calculadora.realizarSoma(num1, num2);
                System.out.println("\nO Resultado: " + resultadoSoma);
            }

            // Digitado 2( Subtrair )
            else if (menu == 2) {
                System.out.println("            (SUBTRAÇÃO!)             ");
                System.out.println("Digite (2) números a ser Subtraidos! ");
                System.out.println("********************************");
                double num3, num4;
                while (true) {
                    System.out.println("Digite o Primeiro número: ");
                    if (read.hasNextDouble()) {
                        num3 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next();
                    }
                }
                read.nextLine();
                while (true) {
                    System.out.println("Digite o Segundo número: ");
                    if (read.hasNextDouble()) {
                        num4 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next();
                    }
                }
                double resultadoSubtrair = calculadora.realizarSubtra(num3, num4);
                System.out.println("\nO Resultado: " + resultadoSubtrair);
            }
            // Digitado 3 ( Multiplicar )
            else if (menu == 3) {
                System.out.println("            (Multiplicação!)              ");
                System.out.println("Digite (2) números a ser Multiplicados! ");
                System.out.println("********************************");
                double num5, num6;
                while (true) {
                    System.out.println("Digite o Primeiro número: ");
                    if (read.hasNextDouble()) {
                        num5 = read.nextDouble();
                        break; // Sai do loop se o número for válido

                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next();
                    }
                }
                read.nextLine();
                while (true) {
                    System.out.println("Digite o Segundo número: ");
                    if (read.hasNextDouble()) {
                        num6 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next(); // Limpa o buffer do teclado
                    }
                }
                double resultadoMultiplica = calculadora.realizarMultiplicar(num5, num6);
                System.out.println("\nO Resultado: " + resultadoMultiplica);
            }
            // Digitado 4 ( Dividir )
            else if (menu == 4) {
                System.out.println("            (DIVISÃO!)             ");
                System.out.println("Digite (2) números a ser Dividos! ");
                System.out.println("********************************");
                double num5, num6;
                while (true) {
                    System.out.println("Digite o Primeiro número: ");
                    if (read.hasNextDouble()) {
                        num5 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next();
                    }
                }
                read.nextLine();
                while (true) {
                    System.out.println("Digite o Segundo número: ");
                    if (read.hasNextDouble()) {
                        num6 = read.nextDouble();
                        break; // Sai do loop se o número for válido
                    } else {
                        System.out.println("Erro: Entrada inválida. Digite um número válido.");
                        read.next(); // Limpa o buffer do teclado
                    }
                }
                double resultadoDivisao = calculadora.realizarDivisao(num5, num6);
                System.out.println("\nO Resultado: " + resultadoDivisao);
            } else {
                System.out.println("Você selecionou (SAIR)");
            }
        }
        read.close();
    }
}