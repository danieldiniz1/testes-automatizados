package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enums.Desempenho;

import java.math.BigDecimal;

public class ReajusteService {


    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if (desempenho.equals(Desempenho.A_DESEJAR)){
            funcionario.atualizaSalario(funcionario.getSalario().multiply(BigDecimal.valueOf(1.03)));
        }
    }
}
