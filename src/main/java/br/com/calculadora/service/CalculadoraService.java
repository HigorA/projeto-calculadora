package br.com.calculadora.service;

import br.com.calculadora.model.enums.Operacao;
import br.com.calculadora.model.request.CalculadoraRequest;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Double calcular(CalculadoraRequest calculadoraRequest, Operacao operacao) {
        return operacao.calculo(calculadoraRequest.valor1(), calculadoraRequest.valor2());
    }
}
