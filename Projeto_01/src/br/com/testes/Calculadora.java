package br.com.testes;

public class Calculadora {
    private double somar(double num1, double num2){
        return num1 + num2;
    }

    private double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    private double dividir(double num1, double num2){
        return num1 / num2;
    }

    private double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public double realizarSoma(double num1, double num2){
        return somar(num1, num2);
    }

    public double realizarMultiplicar(double num1, double num2){
        return multiplicar(num1, num2);
    }

    public double realizarDivisao(double num1, double num2){
        return dividir(num1, num2);
    }

    public double realizarSubtra(double num1, double num2){
        return subtrair(num1, num2);
    }
}