package br.com.calculadora.model.request;

import jakarta.validation.constraints.NotNull;

public record CalculadoraRequest (
        @NotNull Double valor1,
        @NotNull Double valor2
) {
}
