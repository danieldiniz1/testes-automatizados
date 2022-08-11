package br.com.alura.tdd.service;

import br.com.alura.tdd.desempenho.impl.DesempenhoADesejar;
import br.com.alura.tdd.desempenho.impl.DesempenhoBom;
import br.com.alura.tdd.desempenho.impl.DesempenhoOtimo;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTeste {

    private ReajusteService service;

    private Funcionario funcionarioSalario2K;

    @BeforeEach
    public void start(){
        service = new ReajusteService();
        funcionarioSalario2K = new Funcionario("Ana", LocalDate.now(), BigDecimal.valueOf(2000));
    }

    @Test
    public void reajustedeveriaserdeTresPorCentoQuandoDesepenhoForADesejar(){
        service.concederReajuste(funcionarioSalario2K, new DesempenhoADesejar());
        Assertions.assertEquals(BigDecimal.valueOf(2060.00).setScale(2),funcionarioSalario2K.getSalario());
    }

    @Test
    public void reajustedeveriaserdeDezPorCentoQuandoDesepenhoForBateuAMeta(){
        service.concederReajuste(funcionarioSalario2K, new DesempenhoBom());
        Assertions.assertEquals(BigDecimal.valueOf(2200.00).setScale(2),funcionarioSalario2K.getSalario());
    }

    @Test
    public void reajustedeveriaserdeVintePorCentoQuandoDesepenhoForSuperouAMeta(){
        service.concederReajuste(funcionarioSalario2K, new DesempenhoOtimo());
        Assertions.assertEquals(BigDecimal.valueOf(2400.00).setScale(2),funcionarioSalario2K.getSalario());
    }
}
