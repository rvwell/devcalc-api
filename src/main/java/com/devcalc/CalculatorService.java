package com.devcalc;

/**
 * Fornece serviços básicos de calculadora.
 */
public final class CalculatorService {
    //Alteração para rodar os testes
    //Simulação de entrega contínua

    /**
     * Adiciona dois números de ponto flutuante.
     *
     * @param a o primeiro número a ser adicionado.
     * @param b o segundo número a ser adicionado.
     * @return a soma de {@code a} e {@code b}.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número de ponto flutuante do primeiro.
     *
     * @param a o número do qual subtrair (minuendo).
     * @param b o número a ser subtraído (subtraendo).
     * @return a diferença entre {@code a} e {@code b}.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dois números de ponto flutuante.
     *
     * @param a o primeiro fator.
     * @param b o segundo fator.
     * @return o produto de {@code a} e {@code b}.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divide o primeiro número de ponto flutuante pelo segundo.
     *
     * @param a o dividendo.
     * @param b o divisor (não pode ser zero).
     * @return o quociente de {@code a} por {@code b}.
     * @throws ArithmeticException se {@code b} for zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
