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
    public double add(final double a, final double b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número de ponto flutuante do primeiro.
     *
     * @param a o número do qual subtrair (minuendo).
     * @param b o número a ser subtraído (subtraendo).
     * @return a diferença entre {@code a} e {@code b}.
     */
    public double subtract(final double a, final double b) {
        return a - b;
    }

    /**
     * Multiplica dois números de ponto flutuante.
     *
     * @param a o primeiro fator.
     * @param b o segundo fator.
     * @return o produto de {@code a} e {@code b}.
     */
    public double multiply(final double a, final double b) {
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
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }

    /**
     * Calcula a raiz quadrada de um número.
     * @param x Número para o qual a raiz será calculada.
     * @return A raiz de x.
     * @throws IllegalArgumentException se x for negativo.
     */
    public double sqrt(final double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Número negativo.");
        }
        return Math.sqrt(x);
    }
}
