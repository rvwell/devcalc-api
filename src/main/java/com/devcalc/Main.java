package com.devcalc;

import io.javalin.Javalin;

public class Main {

    private static final CalculatorService calculator = new CalculatorService();

    public static void main(String[] args) {

        Javalin app = Javalin.create()
                .start(7070);

        app.get("/add", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            double result = calculator.add(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/subtract", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            double result = calculator.subtract(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/multiply", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            double result = calculator.multiply(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/divide", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            double result = calculator.divide(a, b);
            ctx.result(String.valueOf(result));
        });


    }
}
