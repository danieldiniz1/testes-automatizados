package br.com.alura.tdd.service;

import br.com.alura.tdd.desempenho.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {


    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        desempenho.concederReajuste(funcionario);
    }
}
