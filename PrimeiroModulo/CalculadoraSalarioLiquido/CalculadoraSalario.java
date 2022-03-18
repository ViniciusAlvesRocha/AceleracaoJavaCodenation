package com.company;

public class CalculadoraSalario {
    static int calcularSalarioLiquido(double value) {
        if(value < 1039.00){
            return (int)(0.0);
        }
        value = INSS(value);
        value = IRRF(value);
        return (int)(Math.round(value));
    }

    static double INSS(double value) {
        if(value < 1500.00) {
            return value * 0.92;
        } else if (value >= 1500.00 & value <= 4000.00) {
            return value * 0.91;
        } else {
            return value * 0.89;
        }
    }

    static double IRRF(double value){
        if(value < 3000.00) {
            return value;
        } else if(value >= 3000.00 & value <= 6000.00) {
            return value * 0.925;
        }else {
            return value * 0.85;
        }
    }

}

