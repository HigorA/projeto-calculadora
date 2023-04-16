package br.com.calculadora.model.enums;

public enum Operacao implements IOperacao{
    SOMAR{
        public Double calculo(Double valor1, Double valor2) {
            return valor1 + valor2;
        }
    },
    SUBTRAIR {
        public Double calculo(Double valor1, Double valor2) {
            return valor1 - valor2;
        }
    },
    MULTIPLICAR {
        public Double calculo(Double valor1, Double valor2) {
            return valor1 * valor2;
        }
    },
    DIVIDIR {
        public Double calculo(Double valor1, Double valor2) {
            return valor1 / valor2;
        }
    }
}
