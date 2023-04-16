package br.com.calculadora.controller;

import br.com.calculadora.controller.OpenApi.ControllerOpenApi;
import br.com.calculadora.model.enums.Operacao;
import br.com.calculadora.model.request.CalculadoraRequest;
import br.com.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculadora")
public class CalculadoraController implements ControllerOpenApi {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }


    @PostMapping("/{operacao}")
    public Double calculo(
            @RequestBody CalculadoraRequest calculadoraRequest,
            @PathVariable("operacao") Operacao operacao)
    {
        return calculadoraService.calcular(calculadoraRequest, operacao);
    }
}
