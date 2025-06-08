package com.devcalc;

import io.javalin.Javalin;

/**
 * Classe principal que configura e inicia a aplicação.
 */
public final class Main {

    /**
     * Instância do serviço de calculadora.
     */
    private static final CalculatorService CALCULATOR = new CalculatorService();

    /**
     * Porta padrão na qual o servidor Javalin.
     */
    private static final int DEFAULT_PORT = 7070;

    /**
     * Construtor privado para impedir a instanciação de classe utilitária.
     */
    private Main() {
        throw new UnsupportedOperationException("Esta é uma classe utilitária");
    }

    /**
     * Ponto de entrada principal da aplicação.
     * @param args argumentos de linha de comando
     */
    public static void main(final String[] args) {

        Javalin app = Javalin.create()
                .start(DEFAULT_PORT);

        app.get("/add", ctx -> {
            final double a = Double.parseDouble(ctx.queryParam("a"));
            final double b = Double.parseDouble(ctx.queryParam("b"));
            final double result = CALCULATOR.add(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/subtract", ctx -> {
            final double a = Double.parseDouble(ctx.queryParam("a"));
            final double b = Double.parseDouble(ctx.queryParam("b"));
            final double result = CALCULATOR.subtract(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/multiply", ctx -> {
            final double a = Double.parseDouble(ctx.queryParam("a"));
            final double b = Double.parseDouble(ctx.queryParam("b"));
            final double result = CALCULATOR.multiply(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/divide", ctx -> {
            final double a = Double.parseDouble(ctx.queryParam("a"));
            final double b = Double.parseDouble(ctx.queryParam("b"));
            final double result = CALCULATOR.divide(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/square", ctx -> {
            final double a = Double.parseDouble(ctx.queryParam("a"));
            final double result = CALCULATOR.sqrt(a);
            ctx.result(String.valueOf(result));
        });
    }
}
