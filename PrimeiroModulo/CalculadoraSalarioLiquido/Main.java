package com.company;
import com.company.CalculadoraSalario;

public class Main {

    public static void main(String[] args) {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        System.out.println(calculadora.calcularSalarioLiquido(1500.00));
    }
}
