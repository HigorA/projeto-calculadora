package br.com.calculadora.controller.OpenApi;

import br.com.calculadora.model.enums.Operacao;
import br.com.calculadora.model.request.CalculadoraRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Calculadora", description = "Endpoint para usar uma calculadora")
public interface ControllerOpenApi {

    @Operation(
            summary = "Realiza as 4 operações básicas.",
            description = "Realiza as 4 operações básicas, soma, subtração, multiplicação e divisão.",
            tags = {"Calculadora"}
    )
    Double calculo(CalculadoraRequest calculadoraRequest, Operacao operacao);


}
