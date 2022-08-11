package br.com.alura.tdd.desempenho.impl;

import br.com.alura.tdd.desempenho.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class DesempenhoOtimo implements Desempenho {
    @Override
    public void concederReajuste(Funcionario funcionario) {
        funcionario.atualizaSalario(funcionario.getSalario().multiply(BigDecimal.valueOf(1.20)));
    }
}
